package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        String expectedName = "Yev";
        long expectedId = 1234;
        Person person = new Person(expectedId, expectedName);
        long actualId = person.getId();
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void testSetName(){
        String expectedName = "Yev";
        Person person = new Person(0, "");
        person.setName(expectedName);
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }

}
