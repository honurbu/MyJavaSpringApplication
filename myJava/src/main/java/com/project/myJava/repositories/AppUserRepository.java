package com.project.myJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.myJava.entitiess.AppUsers;

@Repository
public interface AppUserRepository extends JpaRepository<AppUsers,Integer>{

}
