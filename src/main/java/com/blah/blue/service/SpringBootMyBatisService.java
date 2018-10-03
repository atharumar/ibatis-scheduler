package com.blah.blue.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.blah.blue.mapper.StudentMapper;

@Service
public class SpringBootMyBatisService {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	@Autowired
	StudentMapper studentMapper;

	@Scheduled(fixedDelay = 15000)
	public void printStudent(){
		logger.info(studentMapper.findById(10001L).getName());
	}
	
}
