package com.project.myJava.services.Implements;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.myJava.entitiess.AppUsers;

@Service
public interface IAppUserService {
	
	void addAppUser(AppUsers appUser);
    List<AppUsers> getAllAppUsers();
    AppUsers getAppUserId(int appUserId);
	
}
