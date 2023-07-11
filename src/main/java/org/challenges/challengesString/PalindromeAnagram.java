package org.challenges.challengesString;

import java.util.stream.Collectors;

public class PalindromeAnagram {

    public static boolean isAnagramOfPalindrome(String input) {


        if (input.length() == 0) {
            throw new IllegalArgumentException("A entrada não pode ter menos de 1 char");
        }

        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .values()
                .stream()
                .filter(count -> count % 2 == 1)
                .count() <= 1;
    }
}
