package com.beans.demo.interfaces;

public interface TeacherInterface {

    void teach(LearnerInterface learnerInterface, double numberOfHours);
    void lecture(Iterable<? extends LearnerInterface> learners, double numberOfHours);
}
