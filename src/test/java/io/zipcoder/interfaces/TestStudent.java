package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student student = new Student(1234, "Yev");
        boolean actual = student instanceof ILearner;
        Assert.assertTrue(actual);
    }
    @Test
    public void testInheritance(){
        Student student = new Student(1234, "Yev");
        boolean actual = student instanceof Person;
        Assert.assertTrue(actual);
    }
    @Test
    public void testLeaen(){
        Student student = new Student(1234, "Yev");
        double expected = 0.0;
        student.learn(expected);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
    }
}
