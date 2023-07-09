package org.example;

import org.apache.commons.lang3.ArrayUtils;


public class ReverseString {
    public static void main(String[] args) {


    }

    public static String reverseString(String input) {

        String[] words = input.split(" ");
        ArrayUtils.reverse(words);

        return String.join(" ", words);
    }

}