package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sf;

	public Student findStudent(int id) {
		// TODO Auto-generated method stub

		Session session = sf.getCurrentSession();

		Student s = session.get(Student.class, id);

		return s;
	}

	public void saveStudent(Student s) {

		Session session = sf.getCurrentSession();

		session.save(s);

		System.out.println("Record inserted");

	}

	public List<Student> listStudent() {

		Session session = sf.getCurrentSession();

		List<Student> list = session.createQuery("from Student").list();
		return list;
	}

}
