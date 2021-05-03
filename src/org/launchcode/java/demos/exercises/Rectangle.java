package org.launchcode.java.demos.exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of the rectangle:");
        int length = input.nextInt();

        System.out.println("Enter width of the rectangle:");
        int width = input.nextInt();

        System.out.println("The area of your rectangle is: " + (length * width));
    }
}
