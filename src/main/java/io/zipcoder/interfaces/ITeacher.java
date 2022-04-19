package io.zipcoder.interfaces;

public interface ITeacher {
    public void teach(ILearner learner, double numberOfHours);
    public void lecture(ILearner[]learners, double numberOfHours);
}
