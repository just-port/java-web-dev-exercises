package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student aStudent) {
        this.enrolledStudents.add(aStudent);
    }

    public void rollCall() {
        for (Student aStudent : enrolledStudents) {
            System.out.println(aStudent.getName());
        }
    }

    public String toString() {
        return topic + ", taught by " + instructor.getFirstName() + " " + instructor.getLastName() + ".";
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) toBeCompared;
        return theCourse.toString().equals(toString());
    }

    public static void main(String[] args) {
        Teacher mrRogers = new Teacher("Fred", "Rogers", "Childhood", 45);
        Course aCourse = new Course("Childhood", mrRogers);
        Student juLoPo = new Student("Justin Portell");
        aCourse.addStudent(juLoPo);
        System.out.println(aCourse);
    }
}
