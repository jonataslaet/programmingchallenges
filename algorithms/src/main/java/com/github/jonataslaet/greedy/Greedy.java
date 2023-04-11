package com.github.jonataslaet.greedy;

import java.util.*;

public class Greedy {

    public static Set<String> getFinalStations() {
        Set<String> statesNeeded = Configuration.getStatesNeeded();
        Map<String, Set<String>> stations = Configuration.getStations();

        Set<String> finalStations = new HashSet<>();
        while(!statesNeeded.isEmpty()) {
            String bestStation = null;
            Set<String> statesCovered = new HashSet<>();
            for (String station : stations.keySet()) {
                Set<String> covered = getIntesectionSet(statesNeeded, stations.get(station));
                if (covered.size() > statesCovered.size()) {
                    bestStation = station;
                    statesCovered = covered;
                }
            }
            finalStations.add(bestStation);
            statesNeeded.removeAll(statesCovered);
        }
        return finalStations;
    }

    private static Set<String> getIntesectionSet(Set<String> statedNeeded,
                                                 Set<String> statesForStation) {
        Set<String> temporaryStatesNeeded = new HashSet<>(statedNeeded);
        temporaryStatesNeeded.retainAll(statesForStation);
        return temporaryStatesNeeded;
    }


}
