package io.zipcoder.interfaces;

public enum Educator implements ITeacher{
    INSTRUCTOR1(1, "Yev"), INSTRUCTOR2(2, "Yev Jr");

    private Instructor instructor;

    Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public void teach(ILearner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(ILearner[] learners, double numberOfHours){
        int size = learners.length;
        for (ILearner learner: learners) {
            learner.learn(numberOfHours/size);
        }
    }
}
