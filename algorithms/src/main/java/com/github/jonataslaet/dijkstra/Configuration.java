package com.github.jonataslaet.dijkstra;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
    public static Map<String, Map<String, Double>> getGraph() {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 6.0);
        graph.get("start").put("b", 2.0);

        graph.put("a", new HashMap<>());
        graph.get("a").put("final", 1.0);

        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 3.0);
        graph.get("b").put("final", 5.0);

        graph.put("final", new HashMap<>());

        return graph;
    }

}
