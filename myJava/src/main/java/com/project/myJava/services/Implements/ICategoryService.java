package com.project.myJava.services.Implements;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.myJava.entitiess.Category;

@Service
public interface ICategoryService {

	 	void addCategory(Category category);
	    List<Category> getAllCategories();
	    Category getCategoryId(int categoryId);
}
