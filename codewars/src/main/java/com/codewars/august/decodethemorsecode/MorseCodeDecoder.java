package com.codewars.august.decodethemorsecode;


import java.util.*;
//https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
public class MorseCodeDecoder {
    class MorseCode {
        final static Map<String, String> map = new HashMap<>(){{
            put(".-", "A");
            put("-...", "B");
            put("-.-.", "C");
            put("-..", "D");
            put(".", "E");
            put("..-.", "F");
            put("--.", "G");
            put("....", "H");
            put("..", "I");
            put(".---", "J");
            put("-.-", "K");
            put(".-..", "L");
            put("--", "M");
            put("-.", "N");
            put("---", "O");
            put(".--.", "P");
            put("--.-", "Q");
            put(".-.", "R");
            put("...", "S");
            put("-", "T");
            put("..-", "U");
            put("...-", "V");
            put(".--", "W");
            put("-..-", "X");
            put("-.--", "Y");
            put("--..", "Z");
            put("-----", "0");
            put(".----", "1");
            put("..---", "2");
            put("...--", "3");
            put("....-", "4");
            put(".....", "5");
            put("-....", "6");
            put("--...", "7");
            put("---..", "8");
            put("----.", "9");
        }};

        static String get(String key) {
            return map.get(key);
        }
    }
    public static String decode(String morseCode) {
        String[] splitedMorseCode = morseCode.trim().split("  ");
        List<String> wordsList = Arrays.stream(splitedMorseCode).toList();
        String translatedWord = "";
        String translatedPhrase = "";
        for (String spacedWord: wordsList) {
            String[] letters = spacedWord.split(" ");
            translatedWord = Arrays.stream(letters).filter(letter -> !letter.isEmpty()).map(MorseCode::get).reduce("", String::concat);
            translatedPhrase = translatedPhrase.concat(translatedWord).concat(" ");
        }
        return translatedPhrase.trim();
    }
}
