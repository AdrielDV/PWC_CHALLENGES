package org.challenges.challengesString;

import org.apache.commons.lang3.ArrayUtils;


public class ReverseString {


    public static void main(String[] args) {
        System.out.println(reverseString("Teste"));
    }

    public static String reverseString(String input) {

        String[] words = input.split(" ");
        ArrayUtils.reverse(words);

        return String.join(" ", words);
    }

}