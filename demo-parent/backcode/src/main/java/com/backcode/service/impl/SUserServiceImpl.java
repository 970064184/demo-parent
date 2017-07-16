package com.backcode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backcode.model.SUser;
import com.backcode.repository.SUerRepository;
import com.backcode.service.SUserService;

@Service
public class SUserServiceImpl implements SUserService {

	@Autowired
	private SUerRepository sUerRepository;
	
	@Override
	public List<SUser> findAll() {
		return sUerRepository.findAll();
	}

}
