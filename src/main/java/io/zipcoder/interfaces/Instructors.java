package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();
    private Instructors(){
        Instructor instructor = new Instructor(1, "Yev");
        Instructor instructor1 = new Instructor(2, "Yev Jr");
        personList.add(instructor);
        personList.add(instructor1);
    }
    public static Instructors getInstance(){
        return INSTANCE;
    }
}
