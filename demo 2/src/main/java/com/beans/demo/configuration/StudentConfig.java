package com.beans.demo.configuration;

import com.beans.demo.Student;
import com.beans.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        Student student1 = new Student(1L, "James");
        Student student2 = new Student(2L, "Matthew");
        return new Students(student1, student2);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
//        Student student1 = new Student(17L, "Mary");
//        Student student2 = new Student(23L, "Ethel");
//        return new Students(student1, student2);
       return new Students();
    }
}
