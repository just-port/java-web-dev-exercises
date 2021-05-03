package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


        // get radius from the user
        double radius;
        System.out.println("Enter a radius:");
        radius = input.nextDouble();
        input.close();

        if (radius <= 0 || Double.isNaN(radius)) {
            throw new Error("Your input is not accepted.");
        }

        /*
            do {
             //get radius from the user
               System.out.println("Enter a radius:");
                radius = input.nextDouble();
                input.close();
            } while (radius < 1 || Double.isNaN(radius));

        */

        //calculate the area of the circle
        double area = Circle.getArea(radius);


        // print the area of the circle with user input radius
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
