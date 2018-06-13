package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.config.ValidationResponse;
import com.app.entity.Student;
import com.app.service.StudentServiceImpl;

@RestController

@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServiceImpl service;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public Student view(@RequestParam int id) {

		Student s = service.seeStudent(id);

		return s;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)

	public String add(@RequestParam String firstName, @RequestParam String lastName) {

		Student s = new Student();

		s.setFirstName(firstName);
		s.setLastName(lastName);

		service.saveStudent(s);

		return "success";
	}

	@RequestMapping(value = "/viewall", method = RequestMethod.GET)

	public ValidationResponse viewall() {

		ValidationResponse response = new ValidationResponse();
		List<Student> s = service.listView();
		response.setResponse(s);
		return response;
	}

}
