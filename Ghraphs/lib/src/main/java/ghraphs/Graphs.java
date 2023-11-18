package ghraphs;

import java.util.*;

public class Graphs {
    private Map<Vertex, List<Edge>> adjacencyList;

    public Graphs() {
        this.adjacencyList = new HashMap<>();
    }


    public Vertex addVertex(int value) {
        Vertex vertex = new Vertex(value);
        adjacencyList.put(vertex, new ArrayList<>());
        return vertex;
    }

    public void addEdge(Vertex start, Vertex end, int weight) {
        if (!adjacencyList.containsKey(start) || !adjacencyList.containsKey(end)) {
            throw new IllegalArgumentException("Vertices must already be in the graph");
        }

        List<Edge> edges = adjacencyList.get(start);
        edges.add(new Edge(start, end, weight));
    }

    public Collection<Vertex> getVertices() {
        return adjacencyList.keySet();
    }

    public Collection<Edge> getNeighbors(Vertex vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            throw new IllegalArgumentException("Vertex not found in the graph");
        }
        return adjacencyList.get(vertex);
    }

    public int size() {
        return adjacencyList.size();
    }



}
