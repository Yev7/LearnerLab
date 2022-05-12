package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void getInstructors(){
        Instructors instructors = Instructors.getInstance();
        Integer expected = 2;
        Integer actual = instructors.personList.size();
        Assert.assertEquals(expected, actual);
    }
}
