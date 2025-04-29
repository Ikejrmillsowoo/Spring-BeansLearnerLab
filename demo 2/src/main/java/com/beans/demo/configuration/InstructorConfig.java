package com.beans.demo.configuration;

import com.beans.demo.Instructor;
import com.beans.demo.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class InstructorConfig {

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        return new Instructors();
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        return new Instructors();
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors(){
        return new Instructors();
    }
}
