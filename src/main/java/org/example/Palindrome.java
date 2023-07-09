package org.example;

import java.util.Comparator;
import java.util.stream.IntStream;


public class Palindrome {
    public static void main(String[] args) {


    }

    public static String getPalindrome(String input) {


        return IntStream.range(0, input.length())
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(i + 1, input.length()).mapToObj(j -> input.substring(i, j)))
                .filter(substring -> new StringBuilder(substring).reverse().toString().equals(substring))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }


}

