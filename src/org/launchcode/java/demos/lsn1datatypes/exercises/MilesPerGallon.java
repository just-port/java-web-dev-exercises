package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        int miles = input.nextInt();

        System.out.println("How much gas have you used?");
        int gallons = input.nextInt();

        System.out.println(miles / gallons);
    }
}
