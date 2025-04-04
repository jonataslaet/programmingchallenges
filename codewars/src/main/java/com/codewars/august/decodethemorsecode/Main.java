package com.codewars.august.decodethemorsecode;

public class Main {
    public static void main(String[] args){
        String phrase = ".... . -.--   .--- ..- -.. .";
        String result = MorseCodeDecoder.decode(phrase);
        System.out.println(result);
    }
}