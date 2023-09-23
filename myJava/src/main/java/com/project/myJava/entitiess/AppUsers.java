package com.project.myJava.entitiess;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="appusers")
@Data
public class AppUsers {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int Id;
	String userName;
	String password;
}
