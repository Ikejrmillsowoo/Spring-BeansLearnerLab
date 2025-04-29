package com.beans.demo.configuration;

import com.beans.demo.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;

@Configuration
@Import({InstructorConfig.class, StudentConfig.class})
public class ClassroomConfig {


    @DependsOn({"instructors", "students"})
    @Bean(name = "currentCohort")
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @Bean("previousCohort")
    public Classroom previousCohort(Instructors instructors, Students previoustudents){
        return new Classroom( instructors, previoustudents);
    }


}
