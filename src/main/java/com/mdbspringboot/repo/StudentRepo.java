package com.mdbspringboot.repo;

import com.mdbspringboot.entity.*;
import org.springframework.data.mongodb.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //add repo annotation
public interface StudentRepo extends MongoRepository<Student, String>{
    List<Student> findByName(String name);

    Student findByEmailAndName (String email, String name);

    Student findByNameOrEmail (String name, String email);

    List<Student> findByDepartmentDepartmentName(String deptname);

    List<Student> findBySubjectsSubjectName (String subName);

    List<Student> findByEmailIsLike (String email);

    List<Student> findByNameStartsWith (String name);
}
