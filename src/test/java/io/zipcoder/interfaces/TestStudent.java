package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student student = new Student(1234, "Yev");
        Assert.assertTrue(student instanceof ILearner);
    }
    @Test
    public void testInheritance(){
        Student student = new Student(1234, "Yev");
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        Student student = new Student(1234, "Yev");
        double expected = 0.0;
        student.learn(expected);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
    }
}
