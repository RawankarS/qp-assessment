package com.example.QuestionPro.Assessment.Grocery.service;

import com.example.QuestionPro.Assessment.Grocery.entity.GroceryItem;

public interface AdminService {
	GroceryItem addGroceryItem(GroceryItem groceryItem);

	Iterable<GroceryItem> viewGroceryItems();
	
	GroceryItem updateGroceryItem(GroceryItem groceryItem);

	GroceryItem manageInventory(Long itemId, int quantity);

	void removeGroceryItem(Long itemId);
}
