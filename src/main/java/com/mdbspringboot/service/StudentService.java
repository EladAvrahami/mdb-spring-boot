package com.mdbspringboot.service;

import com.mdbspringboot.entity.Student;
import com.mdbspringboot.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public Student createStudent(Student student){
    return studentRepo.save(student);
    }

}
