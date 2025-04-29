package com.beans.demo.config;

import com.beans.demo.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom classroom;

    @Test
    public void TestCurrentCohortBySize(){
        // given injected

        //when
        List<Student> studentsSize = classroom.getStudents().findAll();
        List<Instructor> instructorsSize = classroom.getInstructors().findAll();

        //Then
        Assert.assertEquals(2, studentsSize.size());
        Assert.assertEquals(2, instructorsSize.size());
    }

    @Test
    public void TestCurrentCohortByName(){
        // given injected

        //when
        Student studentName = classroom.getStudents().findById(2L);
        Instructor instructorName = classroom.getInstructors().findById(20L);
        System.out.println(studentName +" "+ instructorName);


        //Then
        Assert.assertEquals("Matthew", studentName.getName());
        Assert.assertEquals("Jordan", instructorName.getName());
    }
}
