package com.example.QuestionPro.Assessment.Grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuestionPro.Assessment.Grocery.entity.GroceryItem;
import com.example.QuestionPro.Assessment.Grocery.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/viewItems")
    public List<GroceryItem> viewAvailableItems() {
        return userService.viewAvailableItems();
    }

    @PostMapping("/bookItems")
    public void bookItems(@RequestBody List<Long> itemIds) {
        userService.bookItems(itemIds);
    }
}
