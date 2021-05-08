package org.launchcode.java.demos.lsn2controlflowandcollections.exercises.arraypractice;

import java.util.Arrays;

public class ArrayPractice {
    public static String stringOfSuess =  "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";


    public static void main(String[] args) {

        int[] arrayPractice = {1, 1, 2, 3, 5, 8};

        for (int num: arrayPractice) {
            System.out.println(num);
        }

        for (int num: arrayPractice) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }


        String[] arrayToString = stringOfSuess.split(" ");

        System.out.println(Arrays.toString(arrayToString));


        System.out.println(arrayToString[0]);
    }
}
