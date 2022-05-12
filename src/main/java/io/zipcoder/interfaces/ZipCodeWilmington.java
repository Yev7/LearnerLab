package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){}

    public void hostLecture(ITeacher teacher, double numberOfHours){
        ILearner[] learners =students.personList.toArray(new ILearner[0]);
        teacher.lecture(learners, numberOfHours);
//        The class should define a method hostLecture which makes use of a long id, double numberOfHours parameter to identify a respective Instructor to host a lecture to the composite personList field in the students reference.
//                The class should define a method getStudyMap which returns a new instance of a mapping from Student objects to Double objects, representative of each respective student's totalStudyTime.

    }
    public void hostLecutre(Long id, double numberOfHours){
        hostLecture((ITeacher) instructors.findById(id), numberOfHours);
    }
    public Map<Student, Double>getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();
        for (Student s: students) {
            studyMap.put(s, s.getTotalStudyTime());
        }return studyMap;
        }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
}
