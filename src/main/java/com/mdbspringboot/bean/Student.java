package com.mdbspringboot.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.security.auth.Subject;
import java.util.List;

@Document(collation = "student")
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


}
