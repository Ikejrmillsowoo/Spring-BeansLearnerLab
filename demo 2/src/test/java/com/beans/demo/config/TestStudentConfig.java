package com.beans.demo.config;


import com.beans.demo.Student;
import com.beans.demo.Students;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    private Students students;
    @Test
    public void testStudentsSize(){

        //while
        int actualNumOfStudents = students.findAll().size();

        //Then
        Assertions.assertEquals(2, actualNumOfStudents);
    }


    @Test
    public void testStudentsName(){
        //Given
        List<Student> actualStudents = students.findAll();

        //while
        Student firstStudentName = actualStudents.get(0);
        Student secondStudentName = actualStudents.get(1);

        //Then
        Assertions.assertEquals("James", firstStudentName.getName());
        Assertions.assertEquals("Matthew", secondStudentName.getName());
    }

    @Test
    public void testStudentsId(){
        //Given
        List<Student> actualStudents = students.findAll();

        //while
        Student firstStudentName = actualStudents.get(0);
        Student secondStudentName = actualStudents.get(1);

        //Then
        Assertions.assertEquals(1L, firstStudentName.getId());
        Assertions.assertEquals(2L, secondStudentName.getId());
    }



}
