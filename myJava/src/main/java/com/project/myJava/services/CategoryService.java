package com.project.myJava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.myJava.entitiess.Category;
import com.project.myJava.repositories.CategoryRepository;
import com.project.myJava.services.Implements.ICategoryService;

@Service
public class CategoryService implements ICategoryService{

	@Autowired
	private CategoryRepository _categoryRepository;
	
	
	public CategoryService(CategoryRepository _categoryRepository) {
		super();
		this._categoryRepository = _categoryRepository;
	}
	
	
	@Override
	public void addCategory(Category category) {
		_categoryRepository.save(category);
		
	}

	@Override
	public List<Category> getAllCategories() {
		
		return _categoryRepository.findAll();
	}

	@Override
	public Category getCategoryId(int categoryId) {
		
		return _categoryRepository.findById(categoryId).orElse(null);
	}

}
