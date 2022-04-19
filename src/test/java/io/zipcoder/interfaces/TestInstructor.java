package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(1234, "Yev");
        boolean answer = instructor instanceof ITeacher;
        Assert.assertTrue(answer);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(1234, "Yev");
        boolean answer = instructor instanceof Person;
        Assert.assertTrue(answer);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(1234, "Yev");
        Student student = new Student(5678, "Yev Jr");
        double expected = 15.0;
        instructor.teach(student, 15.0);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void  testLecture(){
        Instructor instructor = new Instructor(1, "Yev");
        Student student = new Student(2, "Yev Jr");
        Student student1 = new Student(3, "Yev III");
        Student student2 = new Student(4, "Yev IIII");
        Student[] students = new Student[3];
        students[0] = student;
        students[1] = student1;
        students[2] = student2;

        double expected = 15.0;

        instructor.lecture(students, 15.0);
        double actual = 0;
        for (Student s: students){
            actual = actual + s.getTotalStudyTime();
        }
        Assert.assertEquals(expected, actual, 0.1);


    }
}
