package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.StudentDAO;
import com.app.entity.Student;

@Service
@Transactional

public class StudentServiceImpl {

	@Autowired
	private StudentDAO dao;

	public void getStudentService() {

		System.out.println("Student Serivce is called");

	}

	public Student seeStudent(int id) {

		Student s = dao.findStudent(id);

		return s;
	}

	
	public void saveStudent(Student s) {
		
			dao.saveStudent(s);
		
	}

	
	public List<Student> listView() {
		
		List<Student>  slist = dao.listStudent();
	
		return slist;
}
	
}
