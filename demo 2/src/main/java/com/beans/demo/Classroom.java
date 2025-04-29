package com.beans.demo;

public class Classroom {
    private final Instructors instructors;
    private final Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Instructor instructor, double numberOfHours){
        instructor.lecture(students, numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
}
