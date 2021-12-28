package com.springboot.first.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	// http://localhost:8080/student
	@GetMapping(path="student")
	public Student getStudent() {
		return new Student("Salah Uddin","Shah");
	}
	
	@GetMapping("students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Rahim","Shah"));
		students.add(new Student("Karim","Shah"));
		students.add(new Student("Jabed","Shah"));
		
		return students;
	}
	
	// http://localhost:8080/students/salahuddin/Rony
	@GetMapping("students/{firstName}/{lastName}")
	public Student getStudentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student(firstName,lastName);
	}
	
	// build rest API to handle query parameters
		// http://localhost:8080/student/query?firstName=SalahUddin&lastName=Rony
		@GetMapping("/student/query")
		public Student studentQueryParam(
				@RequestParam(name = "firstName") String firstName,
				@RequestParam(name = "lastName") String lastName) {
			return new Student(firstName, lastName);
		}
	
}
