package org.launchcode.java.demos.lsn2controlflowandcollections.exercises.hashmappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRoster {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newStudentID;

        System.out.println("Enter student name (or ENTER to finish):");

        // Get student names and ID numbers
        String newStudentName;
        do {
            System.out.println("Student Name:");
            newStudentName = input.nextLine();

            if (!newStudentName.equals("")) {
                System.out.println("Student ID:");
                newStudentID = input.nextInt();
                students.put(newStudentID, newStudentName);

                // Read in the newline before looping back
                input.nextLine();
            }
        } while(!newStudentName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer,String> student : students.entrySet()) {
            System.out.println(student.getValue() + " (" + student.getKey() + ") ");
        }
    }
}
