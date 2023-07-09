package org.challenges.challengesString;

import java.util.Comparator;
import java.util.stream.IntStream;


public class Palindrome {


    public static String getPalindrome(String input) {

        if (input.length()==0) {
            throw new IllegalArgumentException("A entrada não pode ter menos de 1 char");
        }


        return IntStream.range(0, input.length())
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(i + 1, input.length()).mapToObj(j -> input.substring(i, j)))
                .filter(substring -> substring.length() > 0)
                .filter(substring -> new StringBuilder(substring).reverse().toString().equals(substring))
                .max(Comparator.comparingInt(String::length))
                .orElse("Não tem palíndromo");
    }


}

