package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // OG text
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        // get user input for a search term
        System.out.println("Enter search term:");
        String searchTerm = input.nextLine();
        input.close();

        // case insensitive check if the text contains the searchTerm
        //System.out.println(firstSentence.toLowerCase().contains(searchTerm.toLowerCase()));

        // find the position of searchTerm
        int indexOfSearchTerm = firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase());

        // use the String method substring and concat to print the new String
        System.out.println(firstSentence.substring(0, indexOfSearchTerm) + firstSentence.substring(indexOfSearchTerm + searchTerm.length()));
    }
}