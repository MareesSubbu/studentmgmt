package com.asm.student.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asm.student.model.Student;
import com.asm.student.model.StudentResponse;
import com.asm.student.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

	private final StudentService studentService;
	
	
	@GetMapping(value = "/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		return null;
		
	}
	
	@GetMapping
	public List<Student> getStudents(){
		
		return null;
	}
	
	@PostMapping
	public StudentResponse saveStudent(@Validated @RequestBody Student student) {
		
		return studentService.saveStudent(student);
	}
	
	@PutMapping
	public Student updateStudent(@RequestBody Student student) {
		
		return null;
	}
}
