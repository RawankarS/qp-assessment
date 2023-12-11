package com.example.QuestionPro.Assessment.Grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuestionPro.Assessment.Grocery.entity.GroceryItem;
import com.example.QuestionPro.Assessment.Grocery.repository.GroceryItemRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private GroceryItemRepository groceryItemRepository;

	@Override
	public List<GroceryItem> viewAvailableItems() {
		return groceryItemRepository.findAll();
	}

	@Override
	public void bookItems(List<Long> itemIds) {
		// TODO Auto-generated method stub

	}

	// Implementation
}
