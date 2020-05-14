package io.github.johnlinp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstagramValidator {
    public static boolean isValidUsername (String str) {
        if (!isMatchingRegexp(str, "^[A-Za-z0-9_\\.]+$")) {
            return false;
        }
        if (isMatchingRegexp(str, "^[0-9]+$")) {
            return false;
        }
        if (str.startsWith(".") || str.endsWith(".")) {
            return false;
        }
        if (str.length() > 30) {
            return false;
        }
        return true;
    }

    public static boolean isValidHashtag (String str) {
        return isMatchingRegexp(str, "^#[^~`!@#$%^&*\\(\\)\\-\\+={}\\[\\]:;\"'<>\\?,\\./|\\\\\\s]+$");
    }

    private static boolean isMatchingRegexp (String str, String regexp) {
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
