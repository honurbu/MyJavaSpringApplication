package com.project.myJava.entitiess;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@Table(name="products")

public class Product {

	@Id
	int Id;
	String Name;
	float Price;	

	
	@ManyToOne
    @JoinColumn(name = "Category_id")
	private Category category;

	
}
