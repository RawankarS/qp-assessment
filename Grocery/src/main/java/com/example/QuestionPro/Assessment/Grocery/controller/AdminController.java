package com.example.QuestionPro.Assessment.Grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuestionPro.Assessment.Grocery.entity.GroceryItem;
import com.example.QuestionPro.Assessment.Grocery.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/add")
	public GroceryItem addGroceryItem(@RequestBody GroceryItem groceryItem) {
		return adminService.addGroceryItem(groceryItem);
	}

	@GetMapping("/view")
	public Iterable<GroceryItem> viewGroceryItems() {
		return adminService.viewGroceryItems();
	}

	@DeleteMapping("/remove/{itemId}")
	public void removeGroceryItem(@PathVariable Long itemId) {
		adminService.removeGroceryItem(itemId);
	}

	@PutMapping("/update")
	public GroceryItem updateGroceryItem(@RequestBody GroceryItem groceryItem) {
		return adminService.updateGroceryItem(groceryItem);
	}

	@PatchMapping("/manageInventory/{itemId}/{quantity}")
	public GroceryItem manageInventory(@PathVariable Long itemId, @PathVariable int quantity) {
		return adminService.manageInventory(itemId, quantity);
	}
}
