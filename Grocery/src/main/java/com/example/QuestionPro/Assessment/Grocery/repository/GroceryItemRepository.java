package com.example.QuestionPro.Assessment.Grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.QuestionPro.Assessment.Grocery.entity.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
	@Modifying
    @Query("DELETE FROM GroceryItem g WHERE g.id = :itemId")
    void removeById(@Param("itemId") Long itemId);
	
}