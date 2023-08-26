package com.asm.student.service;

import org.springframework.stereotype.Service;

import com.asm.student.model.Student;
import com.asm.student.model.StudentResponse;

@Service
public class StudentService {

	public StudentResponse saveStudent(Student student) {
		
	    StudentResponse response =  new StudentResponse();
	    response.setStatus("Student Record Successfully Created!");
	    
		return response;
	}

}
