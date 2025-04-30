package com.beans.demo;

import com.beans.demo.interfaces.LearnerInterface;
import com.beans.demo.interfaces.TeacherInterface;

public class Instructor extends Person  implements TeacherInterface {
//    LearnerInterface learnerInterface;


    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(LearnerInterface learnerInterface, double numberOfHours) {
        learnerInterface.learn(numberOfHours);
    }



    @Override
    public void lecture(Iterable<? extends LearnerInterface> learners, double numberOfHours) {
    int count = 0;
    for (LearnerInterface leaner: learners){
        count++;
    }
    for (LearnerInterface learner : learners){
        learner.learn(numberOfHours/count);
    }
    }
}
