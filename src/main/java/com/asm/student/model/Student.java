package com.asm.student.model;

import org.springframework.lang.NonNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

	private int studentId;
	
	@NonNull
	private String studentName;
	
	private Address studentAddress;
	
}
