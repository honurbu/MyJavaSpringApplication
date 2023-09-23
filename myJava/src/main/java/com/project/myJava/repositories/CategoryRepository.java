package com.project.myJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.myJava.entitiess.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
