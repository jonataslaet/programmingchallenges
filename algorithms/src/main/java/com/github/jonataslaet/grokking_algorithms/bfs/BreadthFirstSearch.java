package com.github.jonataslaet.grokking_algorithms.bfs;

import java.util.*;

public class BreadthFirstSearch {

    static Map<String, List<String>> graph = new HashMap<>();
    static Map<String, Boolean> visited;
    static String person;

    public static boolean search(String name) {
        initializeGraph(graph);
        Queue search_queue = new LinkedList();
        search_queue.addAll(graph.get(name));
        visited = new HashMap<>();
        while(!search_queue.isEmpty()) {
            person = (String) search_queue.poll();
            if (personWasNotVisited(person, visited)) {
                if (personIsSeller(person)) {
                    System.out.println(person + " is a mango seller!");
                    return true;
                } else {
                    search_queue.addAll(graph.get(person));
                    visited.put(person, true);
                }
            }
        }
        return false;
    }

    private static boolean personWasNotVisited(String person, Map<String, Boolean> visited) {
        return !(visited.containsKey(person) && visited.get(person));
    }

    private static boolean personIsSeller(String person) {
        return person.toLowerCase().endsWith("m");
    }

    private static void initializeGraph(Map<String, List<String>> graph) {
        graph.put("you", new ArrayList<>(Arrays.asList("alice", "bob", "claire")));
        graph.put("bob", new ArrayList<>(Arrays.asList("anuj", "peggy")));
        graph.put("alice", new ArrayList<>(List.of("peggy")));
        graph.put("claire", new ArrayList<>(Arrays.asList("thom", "jonny")));
        graph.put("anuj", new ArrayList<>(List.of("")));
        graph.put("peggy", new ArrayList<>(List.of("")));
        graph.put("thom", new ArrayList<>(List.of("")));
        graph.put("jonny", new ArrayList<>(List.of("")));
    }
}
