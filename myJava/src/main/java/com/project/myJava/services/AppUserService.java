package com.project.myJava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.myJava.entitiess.AppUsers;
import com.project.myJava.repositories.AppUserRepository;
import com.project.myJava.services.Implements.IAppUserService;

@Service
public class AppUserService implements IAppUserService{

	@Autowired
	private AppUserRepository _appUserRepository;
	
	@Override
	public void addAppUser(AppUsers appUser) {
		_appUserRepository.save(appUser);
	}

	@Override
	public List<AppUsers> getAllAppUsers() {
		
		return _appUserRepository.findAll();
	}

	@Override
	public AppUsers getAppUserId(int appUserId) {
		
		return _appUserRepository.findById(appUserId).orElse(null);
	}

}
