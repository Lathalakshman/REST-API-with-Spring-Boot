package com.student.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.project.repository.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/allStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students = null;
		try {
			students = studentService.getAllStudent();
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
}
