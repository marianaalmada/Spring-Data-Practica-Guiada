package com.informatorio.moviesfest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.moviesfest.domain.Category;
import com.informatorio.moviesfest.repository.CategoryRepository;

@RestController
public class CategoryController {
    
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @PostMapping("/category")
    public Category createCategory(@RequestBody Category category) {
        return categoryRepository.save(category);
    }
    
}
