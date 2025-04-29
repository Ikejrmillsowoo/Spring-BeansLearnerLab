package com.beans.demo;

import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor> {

    public Instructors(Instructor... instructors) {
        super(List.of(instructors));
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}
