package com.beans.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alumni {

    private Students students;
    private Instructors instructors;
    @Autowired
    public Alumni(@Qualifier("previousStudents")Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }


    @PostConstruct
    public void executiveBootcamp(){
        double totalNumberOfHours = 1200;
        double hoursPerStudent = totalNumberOfHours;

        // Use the first available instructor to teach all students
        Instructor instructor = instructors.findAll().get(0); // Assuming list is not empty
        if (instructor != null) {
            instructor.lecture(students.findAll(), hoursPerStudent);
        }
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }


}
