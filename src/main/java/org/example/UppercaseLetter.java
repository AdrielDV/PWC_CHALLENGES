package org.example;

import java.util.Arrays;


public class UppercaseLetter {

    public static void main(String[] args) {


    }

    public static String upperCaseFirstLetter(String input) {
        String[] words = input.split(" ");

        Arrays.setAll(words, i -> words[i].substring(0, 1).toUpperCase() + words[i].substring(1));

        return String.join(" ", words);
    }

}
