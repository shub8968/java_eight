package tech.bhagavati.regex;

import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String[] args) {

        boolean result = isValid("", "");
        System.out.println(result);
    }

    private static boolean isValid(String input, String expectedMatch) {
        return Pattern.compile(",").splitAsStream(input)
                .anyMatch(expectedMatch::contains);
    }
}


