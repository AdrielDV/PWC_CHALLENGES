package org.challenges.challengesString;




public class UppercaseLetter {


    public static String upperCaseFirstLetter(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException("A entrada não pode ter menos de 1 char");
        }

        String[] sentences = input.split("(?<=[.!?])\\s+");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].substring(0, 1).toUpperCase() + sentences[i].substring(1);
        }
        return String.join(" ", sentences);
    }


}
