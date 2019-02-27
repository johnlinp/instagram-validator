package io.github.johnlinp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InstagramValidator {
    public static boolean isValidHashtag(String str) {
        Pattern pattern = Pattern.compile("^#[^~`!@#$%^&*\\(\\)\\-\\+={}\\[\\]:;\"'<>\\?,\\./|\\\\\\s]+$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
