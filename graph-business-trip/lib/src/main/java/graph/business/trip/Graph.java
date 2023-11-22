package graph.business.trip;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<String, Map<String, Integer>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addEdge(String source, String destination, int cost) {
        adjacencyList.computeIfAbsent(source, k -> new HashMap<>()).put(destination, cost);
    }

    public Map<String, Integer> getNeighbors(String city) {
        return adjacencyList.get(city);
    }
}
