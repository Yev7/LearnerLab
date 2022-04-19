package io.zipcoder.interfaces;

public class Student extends  Person implements ILearner{
    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime = this.totalStudyTime + numberOfHours;

    }

    @Override
    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
