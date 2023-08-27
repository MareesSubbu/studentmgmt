package com.asm.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asm.student.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
