package com.app.dao;

import java.util.List;

import com.app.entity.Student;

public interface StudentDAO {

	public Student findStudent(int id);
	

	public void saveStudent(Student s);
	public List<Student> listStudent();
	
}
