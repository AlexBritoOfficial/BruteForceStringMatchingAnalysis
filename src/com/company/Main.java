package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "NOBODY NOTICED HIM";
        String pattern = "NOT";

        BruteForceStringMatch(text,pattern);


    }

    public static int BruteForceStringMatch(String text, String pattern){
        final int TEXT_SIZE = text.length();
        final int PATTERN_SIZE = pattern.length();
        for (int i = 0; i < (TEXT_SIZE - PATTERN_SIZE) ; i++) {
            int j = 0;
            while (j < PATTERN_SIZE && pattern.charAt(j) == text.charAt(i + j)){
                j = j + 1 ;
            }
            if (j == PATTERN_SIZE) {
                return i;
            }
        }
        return -1;
    }
}
