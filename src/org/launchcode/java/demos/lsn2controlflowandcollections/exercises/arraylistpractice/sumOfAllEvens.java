package org.launchcode.java.demos.lsn2controlflowandcollections.exercises.arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class sumOfAllEvens {
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>(
                Arrays.asList(94, 8, 67, 14, 33, 47, 82, 28, 13, 15));

        int sumOfAllEvens = addEvenFromList(numList);
        System.out.println(sumOfAllEvens);

    }

    public static int addEvenFromList(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num: list) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}