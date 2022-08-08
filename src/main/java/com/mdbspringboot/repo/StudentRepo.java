package com.mdbspringboot.repo;

import com.mdbspringboot.bean.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository //add repo annotation
public interface StudentRepo extends MongoRepository<Student,String> {
}
