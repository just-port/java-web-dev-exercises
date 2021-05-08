package org.launchcode.java.studios.countingcharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) throws IOException
    {
        Path fileFullOfString = Path.of("src/org/launchcode/java/studios/countingcharacters/FileFullOfString.txt");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String to count:");
        String toFile = input.nextLine();

        Files.writeString(fileFullOfString, toFile);

        String fromFile = Files.readString(fileFullOfString).toUpperCase().replaceAll("[^A-Za-z]+", "");

        char[] charactersInString = fromFile.toCharArray();

        Map<Character, Integer> characterCount = new HashMap<>();
        for (Character c: charactersInString)
        {
            Integer count = characterCount.get(c);
            if (count == null) {
            count = 0;
        }
            characterCount.put(c, count + 1);
        }

        for (Map.Entry<Character, Integer> entry:
        characterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
