package com.github.jonataslaet.grokking_algorithms.dijkstra;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Dijkstra {
    
    public static Double getTotalCost(String initialNode, String finalNode, Map<String, String> parents) {
        Map<String, Double> costs = initializeCosts(initialNode);
        Map<String, Boolean> processedNodes = new HashMap<>();
        String currentNode = initialNode;
        while (Objects.nonNull(currentNode)) {
            Double cost = getCostToNode(currentNode, costs);
            Map<String, Double> neighbours = getNeighbours(currentNode);
            for (String neighbourNode: neighbours.keySet()) {
                parents.put(neighbourNode, currentNode);
                Double costToNeighbourNode = getCostToNode(neighbourNode, neighbours);
                Double newCostOfNeighbour = cost + costToNeighbourNode;
                Double oldCostOfNeighbour = getCostToNode(neighbourNode, costs);
                if ((Objects.isNull(oldCostOfNeighbour)) || (oldCostOfNeighbour > newCostOfNeighbour)) {
                    costs.put(neighbourNode, newCostOfNeighbour);
                    parents.put(neighbourNode, currentNode);
                }
            }
            processedNodes.put(currentNode, Boolean.TRUE);
            currentNode = findLowestCostNode(costs, processedNodes);
        }
        return costs.get(finalNode);
    }

    private static Map<String, Double> initializeCosts(String initialNode) {
        Map<String, Double> allCosts = getNeighbours(initialNode);
        for (String node: Configuration.getGraph().keySet()) {
            if (!allCosts.containsKey(node)) {
                allCosts.put(node, Double.POSITIVE_INFINITY);
            }
        }
        return allCosts;
    }

    private static Double getCostToNode(String lowestCostNode, Map<String, Double> costs) {
        return costs.get(lowestCostNode);
    }

    private static Map<String, Double> getNeighbours(String lowestCostNode) {
        return Configuration.getGraph().get(lowestCostNode);
    }

    private static String findLowestCostNode(Map<String, Double> costs, Map<String, Boolean> processedNodes) {
        String lowestCostNode = null;
        Double lowestCost = Double.POSITIVE_INFINITY;
        for (String node: costs.keySet()) {
            if (costs.get(node) < lowestCost && !isProcessed(node, processedNodes)) {
                lowestCostNode = node;
                lowestCost = costs.get(node);
            }
        }
        return lowestCostNode;
    }

    private static boolean isProcessed(String key, Map<String, Boolean> processedNodes) {
        return Objects.nonNull(processedNodes.get(key));
    }


}
