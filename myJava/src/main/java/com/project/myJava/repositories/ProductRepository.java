package com.project.myJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.myJava.entitiess.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
