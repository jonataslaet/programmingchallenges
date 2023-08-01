package com.codewars.july.jadencasingstrings;

import java.util.Objects;
import java.util.regex.Pattern;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (Objects.isNull(phrase) || phrase.isEmpty()) return null;
        phrase = Pattern.compile("[a-z]{1}")
                .matcher(phrase).replaceFirst(match -> match.group(0).toUpperCase());;
        phrase = Pattern.compile("[\\s+][a-z]")
                .matcher(phrase).replaceAll(match -> match.group(0).toUpperCase());
        return phrase;
    }

}
