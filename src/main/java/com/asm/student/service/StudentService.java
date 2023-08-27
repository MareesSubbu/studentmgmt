package com.asm.student.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.asm.student.entity.StudentEntity;
import com.asm.student.model.Student;
import com.asm.student.model.StudentResponse;
import com.asm.student.repo.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepo;
    
	public StudentResponse saveStudent(Student student) {
		

	    StudentEntity studentEntity = new StudentEntity();
	    
	    studentEntity.setStuId(student.getStudentId());
	    studentEntity.setStuName(student.getStudentName());
	    studentEntity.setSubject("Maths");
	    studentRepo.save(studentEntity);
	    
        StudentResponse response = new StudentResponse();
        response.setStatus("Student Record Successfully Created!");
    
		return response;
	}

    public Optional<StudentEntity> getStudent(int studentId) {
        return studentRepo.findById(studentId);
    }

}
