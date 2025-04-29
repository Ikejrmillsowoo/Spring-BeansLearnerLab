package com.beans.demo.config;

import com.beans.demo.Instructor;
import com.beans.demo.Instructors;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestInstructorConfig {

    @Autowired
    @Qualifier("usaInstructors")
    private Instructors instructors;

    @Test
    public void testInstructorsSize(){

        //while
        int actualNumOfInstructors = instructors.findAll().size();

        //Then
        Assertions.assertEquals(2, actualNumOfInstructors);
    }


    @Test
    public void testInstructorsName(){
        //Given
        List<Instructor> actualInstructors = instructors.findAll();

        //while
        Instructor firstInstructorName = actualInstructors.get(0);
        Instructor secondInstructorName = actualInstructors.get(1);

        //Then
        Assertions.assertEquals("Eddie", firstInstructorName.getName());
        Assertions.assertEquals("Kenny", secondInstructorName.getName());
    }

    @Test
    public void testInstructorsId(){
        //Given
        List<Instructor> actualInstructors = instructors.findAll();

        //while
        Instructor firstInstructorName = actualInstructors.get(0);
        Instructor secondInstructorName = actualInstructors.get(1);

        //Then
        Assertions.assertEquals(2L, firstInstructorName.getId());
        Assertions.assertEquals(4L, secondInstructorName.getId());
    }

    @Autowired
    @Qualifier("ukInstructors")
    private Instructors ukInstructors;

    @Test
    public void testUkInstructorsSize(){

        //while
        int actualNumOfUkInstructors = ukInstructors.findAll().size();

        //Then
        Assertions.assertEquals(2, actualNumOfUkInstructors);
    }


    @Test
    public void testUkInstructorsName(){
        //Given
        List<Instructor> actualInstructors = ukInstructors.findAll();

        //while
        Instructor firstUkInstructorName = actualInstructors.get(0);
        Instructor secondUkInstructorName = actualInstructors.get(1);

        //Then
        Assertions.assertEquals("Phyllis", firstUkInstructorName.getName());
        Assertions.assertEquals("Irene", secondUkInstructorName.getName());
    }

    @Test
    public void testukInstructorsId(){
        //Given
        List<Instructor> actualUkInstructors = ukInstructors.findAll();

        //while
        Instructor firstUkInstructorName = actualUkInstructors.get(0);
        Instructor secondUkInstructorName = actualUkInstructors.get(1);

        //Then
        Assertions.assertEquals(11L, firstUkInstructorName.getId());
        Assertions.assertEquals(12L, secondUkInstructorName.getId());
    }
}
