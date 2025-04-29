package com.beans.demo.configuration;

import com.beans.demo.Student;
import com.beans.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public List<Student> currentStudents() {
        return new Students().findAll();
    }

    @Bean(name = "previousStudents")
    public List<Student> previousStudents() {
        return new Students().findAll();
    }
}
