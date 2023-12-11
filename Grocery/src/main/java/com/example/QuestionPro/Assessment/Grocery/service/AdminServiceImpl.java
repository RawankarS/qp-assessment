package com.example.QuestionPro.Assessment.Grocery.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuestionPro.Assessment.Grocery.entity.GroceryItem;
import com.example.QuestionPro.Assessment.Grocery.repository.GroceryItemRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private GroceryItemRepository groceryItemRepository;

	@Override
	public GroceryItem addGroceryItem(GroceryItem groceryItem) {
		return groceryItemRepository.save(groceryItem);
	}

	@Override
	public Iterable<GroceryItem> viewGroceryItems() {
		return groceryItemRepository.findAll();
	}

	@Override
	public void removeGroceryItem(Long itemId) {
		
		groceryItemRepository.removeById(itemId);
	}

	@Override
	public GroceryItem updateGroceryItem(GroceryItem groceryItem) {

		Long itemId = groceryItem.getId();
		groceryItemRepository.deleteById(itemId);
		return groceryItem;

	}

	@Override
	public GroceryItem manageInventory(Long itemId, int quantity) {
		Optional<GroceryItem> optionalGroceryItem = groceryItemRepository.findById(itemId);

		if (optionalGroceryItem.isPresent()) {
			GroceryItem groceryItem = optionalGroceryItem.get();

			groceryItem.setQuantity(quantity);

			return groceryItemRepository.save(groceryItem);
		} else {
			throw new NoSuchElementException("GroceryItem not found for itemId: " + itemId);
		}
	}

}
