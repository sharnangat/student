package com.app.service;

import org.springframework.scheduling.annotation.EnableAsync;

import com.app.entity.Student;

@EnableAsync
public interface StdService {

	public Student seeStudent(int id);
  	
}
