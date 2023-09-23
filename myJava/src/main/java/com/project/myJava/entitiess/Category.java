package com.project.myJava.entitiess;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name="category")
public class Category {

	@Id
	int Id;
	String Name;
	
	@OneToMany(mappedBy="category")
	private List<Product> products;
	
}
