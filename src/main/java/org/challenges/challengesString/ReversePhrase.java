package org.challenges.challengesString;

import org.apache.commons.lang3.ArrayUtils;


public class ReversePhrase {

    public static String reversePhrase(String input) {


        if (input.length() == 0) {
            throw new IllegalArgumentException("A entrada não pode ter menos de 1 char");
        }

        String[] words = input.split(" ");
        ArrayUtils.reverse(words);

        return String.join(" ", words);
    }

}