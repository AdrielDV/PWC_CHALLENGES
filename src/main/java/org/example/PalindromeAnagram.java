package org.example;

import java.util.stream.Collectors;

public class PalindromeAnagram {
    public static void main(String[] args) {


    }

    public static boolean isAnagramOfPalindrome(String input) {

        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .values()
                .stream()
                .filter(count -> count % 2 == 1)
                .count() <= 1;
    }
}
