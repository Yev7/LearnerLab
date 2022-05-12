package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void getStudents(){
        Students students = Students.getInstance();
        Integer expected = 2;
        Integer actual = students.personList.size();
        Assert.assertEquals(expected, actual);
    }
}
