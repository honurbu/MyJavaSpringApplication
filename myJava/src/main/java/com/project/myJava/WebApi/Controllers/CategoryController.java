package com.project.myJava.WebApi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.myJava.entitiess.Category;
import com.project.myJava.services.Implements.ICategoryService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor

@RequestMapping("/api/categories")

public class CategoryController {

	@Autowired
	private ICategoryService _categoryService;
	
	@PostMapping("/AddCategory")
	public void Add(@RequestBody() Category category)
	{
		_categoryService.addCategory(category);
	}
	
	
	@GetMapping("getCategories")
	public ResponseEntity<List<Category>> ListCategories()
	{
		List<Category> categories= _categoryService.getAllCategories();
        return ResponseEntity.ok(categories);
	}
	
	@GetMapping("/{id}")
	public Category getByIdCategory(@PathVariable int id)
	{
		return _categoryService.getCategoryId(id);
	}
	
}
