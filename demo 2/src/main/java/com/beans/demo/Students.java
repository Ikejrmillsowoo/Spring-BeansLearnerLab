package com.beans.demo;

import java.util.Iterator;
import java.util.List;

public class Students extends People<Student> {
    public Students(Student... students) {
        super(List.of(students));
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }
}
