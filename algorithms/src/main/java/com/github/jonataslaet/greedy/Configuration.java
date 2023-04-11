package com.github.jonataslaet.greedy;

import java.util.*;

public class Configuration {
    public static Set<String> getStatesNeeded() {
        return new HashSet<>(
                Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));
    }

    public static Map<String, Set<String>> getStations() {
        Map<String, Set<String>> stations = new HashMap<>();

        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        return stations;
    }


}
