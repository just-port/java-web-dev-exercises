package org.launchcode.java.demos.lsn2controlflowandcollections.exercises.arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.launchcode.java.demos.lsn2controlflowandcollections.exercises.arraypractice.ArrayPractice;

public class findWordsOfACertainLength {
    public static void main(String[] args) {
        // import string
        String stringOfSuess = ArrayPractice.stringOfSuess;

        ArrayList<String> listOfSuess = new ArrayList<>(Arrays.asList(stringOfSuess.replaceAll("[^a-zA-Z ]", "").split(" ")));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length for search:");
        int inputNum = input.nextInt();
        input.close();

        findWords(listOfSuess, inputNum);
    }

    public static void findWords(ArrayList<String> list, int userNum) {
        for (String word: list) {
            if (word.length() == userNum) {
                System.out.println(word);
            }
        }
    }
}
