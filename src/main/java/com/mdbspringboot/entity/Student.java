package com.mdbspringboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.security.auth.Subject;
import java.util.List;


@Document(collection = "student")
@Getter
@Setter
public class Student {
    @Id
    private String id;
    private String name; //filed "name" in student collection is the same (like in compass "spring" database)
    @Field(name = "mail")
    private String email;//filed "email" in student collection called mail so we fit it to this var
    private Department department;
    private List<Subject> subjects;

  /*  @PersistenceConstructor //in case u have more than one con tell mongo which of them be related to collection(only in the class which representing the collection)
    public Student(String id, String name, String email, Department department, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.subjects = subjects;
    }

    public Student(String id, Department department) {
        this.id = id;
        this.department = department;
    }*/
}
