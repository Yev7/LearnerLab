package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    List<Person> personList = new ArrayList<>();
    @Test
    public void testAdd(){
        Person person = new Person(1, "Yev");
        personList.add(person);
        Assert.assertTrue(personList.contains(person));
    }
    @Test
    public void testRemove(){
        Person person = new Person(1, "Yev");
        personList.remove(person);
        Assert.assertFalse(personList.contains(person));
    }
    @Test
    public void testById(){
        Person person = new Person(1, "Yev");
        person.getId();
        Assert.assertEquals(1, person.getId());
    }
}
