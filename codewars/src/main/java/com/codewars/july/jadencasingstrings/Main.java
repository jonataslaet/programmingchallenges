package com.codewars.july.jadencasingstrings;

public class Main {
    public static void main(String[] args){
        String phrase = "most trees are blue";
        JadenCase jadenCase = new JadenCase();
        System.out.println(jadenCase.toJadenCase(phrase));
    }
}