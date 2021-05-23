package org.launchcode.java.demos.lsn3classes1.school;


import java.util.ArrayList;

public class Course {
    // course should have a title/name, Teacher, student roster, ?gradebook?
    private String topic;
    private Teacher teacher;
    private final ArrayList<Student> studentRoster;

    public Course(String name, Teacher teacher) {
        this.topic = name;
        this.teacher = teacher;
        this.studentRoster = new ArrayList<>();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTeacherName() {
        return teacher.getName();
    }

    public void setTeacher(Teacher aTeacher) {
        teacher = aTeacher;
    }

    public void addStudent(Student aStudent) {
        this.studentRoster.add(aStudent);
    }

    public void rollCall() {
        for (Student student: studentRoster) {
            System.out.println(student.getName());
        }
    }
}
