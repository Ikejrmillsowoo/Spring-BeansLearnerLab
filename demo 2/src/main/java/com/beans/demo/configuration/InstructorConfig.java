package com.beans.demo.configuration;

import com.beans.demo.Instructor;
import com.beans.demo.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorConfig {

    @Bean(name = "usaInstructors")
    public Instructors tcUsaInstructors(){
        Instructor instructor1 = new Instructor(2L, "Eddie");
        Instructor instructor2 = new Instructor(4L, "Kenny");
        return new Instructors(instructor1, instructor2);
    }

    @Bean(name = "ukInstructors")
    public Instructors tcUkInstructors(){
        Instructor instructor1 = new Instructor(11L, "Phyllis");
        Instructor instructor2 = new Instructor(12L, "Irene");
        return new Instructors(instructor1, instructor2);
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors(){
        Instructor instructor1 = new Instructor(20L, "Jordan");
        Instructor instructor2 = new Instructor(21L, "Eliel");
        return new Instructors(instructor1, instructor2);
    }
}
