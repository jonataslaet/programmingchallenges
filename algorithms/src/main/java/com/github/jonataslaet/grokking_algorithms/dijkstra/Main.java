package com.github.jonataslaet.grokking_algorithms.dijkstra;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Map<String, String> parents = new HashMap<>();
        String begin = "start";
        String end = "final";
        System.out.println("Total cost to final node is " + Dijkstra.getTotalCost(begin, end, parents));
        System.out.println("The path of this cost is: ");

        String currentKey = parents.keySet().stream().filter(k ->
                parents.get(k).equals(begin)).findFirst().orElse(null);
        while(parents.containsKey(currentKey)) {
            System.out.println(parents.get(currentKey) + " -> " + currentKey);
            String finalCurrentKey = currentKey;
            currentKey = parents.keySet().stream().filter(k ->
                    Objects.equals(parents.get(k), finalCurrentKey)).findFirst().orElse(null);
        }
    }
}
