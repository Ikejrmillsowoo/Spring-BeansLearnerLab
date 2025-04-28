package com.beans.demo;

import com.beans.demo.interfaces.LearnerInterface;

public class Student extends Person implements LearnerInterface {

    private double totalStudyTime;
    public Student(Long id, String name) {
        super(id, name);
    }


    public void learn(double numberOfHours){
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
