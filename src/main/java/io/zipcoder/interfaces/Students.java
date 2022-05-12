package io.zipcoder.interfaces;

import java.util.List;

public final class Students extends People<Student>{
    private static final Students INSTANCE = new Students();
    private Students(){
        Student student = new Student(1, "Yev");
        Student student1 = new Student(2, "Yev Jr");

        personList.add(student);
        personList.add(student1);
    }
    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] toArray(){
        return new Student[0];
    }

}
