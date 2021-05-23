package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn3classes1.school.Course;
import org.launchcode.java.demos.lsn3classes1.school.Student;
import org.launchcode.java.demos.lsn3classes1.school.Teacher;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Teacher lcClark = new Teacher("Clark", "Roman", "LC101", 6);

        Student ben = new Student("Ben Dye", 2, 1, 4.0);

        Student justin = new Student("Justin Portell", 1, 1, 4.0);

        Course lc101 = new Course("WebDev", lcClark);

        lc101.addStudent(justin);
        lc101.addStudent(ben);

        lc101.rollCall();

        System.out.println(lc101.getTeacherName());

    }
}
