package org.challenges.challengesString;

import java.util.Arrays;


public class RemoveDuplicatesChars {

    public static String duplicateRemover(String input) {

        if (input.length() == 0) {
            throw new IllegalArgumentException("A entrada não pode ter menos de 1 char");
        }

        StringBuilder output = new StringBuilder();

        Arrays.stream(input.split("")).distinct().forEach(output::append);

        return output.toString();
    }

}

