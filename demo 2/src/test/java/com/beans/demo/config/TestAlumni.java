//package com.beans.demo.config;
//
//import com.beans.demo.Alumni;
//import com.beans.demo.Classroom;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TestAlumni {
//
//    @Autowired
//    @Qualifier("executiveBootcamp")
//    private Alumni alumni;
//
//    @Test
//    public void executiveBootcampTest(){
//        //given injected
//
//        //When
//        int numberOfInstructors = alumni.getInstructors().size();
//        int numberOfStudents = alumni.getStudents().size();
//        double numberOfHoursToTeachEachStudent = 1200;
//        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
//        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;
//
//
//        Assert.assertEquals(1200, numberOfHoursToTeachEachStudent);
//
//    }
//
//}
