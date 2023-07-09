package org.challenges.challengesString;

import java.util.Arrays;


public class RemoveDuplicatesChars {


    public static String duplicateRemover(String input) {
        StringBuilder output = new StringBuilder();

        Arrays.stream(input.split("")).distinct().forEach(output::append);

        return output.toString();
    }

}

