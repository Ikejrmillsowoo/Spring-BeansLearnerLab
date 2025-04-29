package com.beans.demo.configuration;

import com.beans.demo.Classroom;
import com.beans.demo.Instructors;
import com.beans.demo.Students;
import org.springframework.context.annotation.Bean;

public class ClassroomConfig {


    @Bean({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students currentStudents){
        return new Classroom(instructors, currentStudents);
    }

    @Bean({"instructors", "students"})
    public Classroom previousCohort(Instructors instructors, Students previoustudents){
        return new Classroom( instructors, previoustudents);
    }


}
