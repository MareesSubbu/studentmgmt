package com.asm.student.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
public class StudentEntity {

    @Id
    @Column(name = "stu_id")
    private int stuId;
    @Column(name = "stu_name")
    private String stuName;
    @Column(name = "subject")
    private String subject;
}
