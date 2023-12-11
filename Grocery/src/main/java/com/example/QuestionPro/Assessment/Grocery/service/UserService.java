package com.example.QuestionPro.Assessment.Grocery.service;


import java.util.List;

import com.example.QuestionPro.Assessment.Grocery.entity.GroceryItem;

public interface UserService {
	List<GroceryItem> viewAvailableItems();

	void bookItems(List<Long> itemIds);
}
