package com.mdbspringboot.repo;

import com.mdbspringboot.bean.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ItemRepository extends MongoRepository<Student,String> {

    @Query("{name:'?0'}")
    Student findItemByName(String name);

    //uses the category field to get all the items of a particular category
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<Student> findAll(String category);

    public long count();
}
