package ghraphs;

import java.util.*;

public class Graphs<T> {
    private Map<Vertex<T>, List<Edge<T>>> adjacencyList;

    public Graphs() {
        this.adjacencyList = new HashMap<>();
    }


    public Vertex<T> addVertex(T value) {
        Vertex vertex = new Vertex(value);
        adjacencyList.put(vertex, new ArrayList<>());
        return vertex;
    }

    public void addEdge(Vertex<T> start, Vertex<T> end, T weight) {
        if (!adjacencyList.containsKey(start) || !adjacencyList.containsKey(end)) {
            throw new IllegalArgumentException("Vertices must already be in the graph");
        }

        List<Edge<T>> edges = adjacencyList.get(start);
        edges.add(new Edge(start, end, weight));
    }

    public Collection<Vertex<T>> getVertices() {
        return adjacencyList.keySet();
    }

    public Collection<Edge<T>> getNeighbors(Vertex<T> vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            throw new IllegalArgumentException("Vertex not found in the graph");
        }
        return adjacencyList.get(vertex);
    }

    public int size() {
        return adjacencyList.size();
    }

    public List<Vertex<T>> breadthFirst(Vertex<T> startVertex) {
        List<Vertex<T>> visitedVertices = new ArrayList<>();
        Queue<Vertex<T>> queue = new LinkedList<>();


        visitedVertices.add(startVertex);
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            Vertex<T> currentVertex = queue.poll();
            List<Edge<T>> edges = adjacencyList.get(currentVertex);

            if (edges != null) {
                for (Edge edge : edges) {
                    Vertex neighbor = edge.getEnd();
                    if (!visitedVertices.contains(neighbor)) {
                        visitedVertices.add(neighbor);
                        queue.add(neighbor);
                    }}}}
        System.out.println("Breadth-First Traversal: " + visitedVertices);
        return visitedVertices;
    }

}


