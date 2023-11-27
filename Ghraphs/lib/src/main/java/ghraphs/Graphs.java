package ghraphs;

import java.util.*;

public class Graphs<T extends Comparable<? super T>> {
    private Map<Vertex<T>, List<Edge<T>>> adjacencyList;

    public Graphs() {
        this.adjacencyList = new HashMap<>();
    }


    public Vertex<T> addVertex(T value) {
        Vertex<T> vertex = new Vertex<T>(value);
        adjacencyList.put(vertex, new ArrayList<>());
        return vertex;
    }

    public void addEdge(Vertex<T> start, Vertex<T> end, int weight) {
        if (!adjacencyList.containsKey(start) || !adjacencyList.containsKey(end)) {
            throw new IllegalArgumentException("Vertices must already be in the graph");
        }

        List<Edge<T>> edgesStart = adjacencyList.get(start);
        edgesStart.add(new Edge(start, end, weight));

        List<Edge<T>> edgesEnd = adjacencyList.get(end);
        edgesEnd.add(new Edge<T>(end, start, weight));
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
                for (Edge<T> edge : edges) {
                    Vertex<T> neighbor = edge.getEnd();
                    if (!visitedVertices.contains(neighbor)) {
                        visitedVertices.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        return visitedVertices;
    }

    public List<Vertex<T>> depthFirst(Vertex<T> startNode) {
        Set<Vertex<T>> visited = new HashSet<>();
        List<Vertex<T>> result = new LinkedList<>();

        depthFirstHelper(startNode, visited, result);

        return result;
    }

    private void depthFirstHelper(Vertex<T> currentNode, Set<Vertex<T>> visited, List<Vertex<T>> result) {
        if (currentNode == null || visited.contains(currentNode)) {
            return;
        }

        visited.add(currentNode);
        result.add(currentNode);

        List<Edge<T>> edges = adjacencyList.get(currentNode);
        if (edges != null) {
            for (Edge<T> edge : edges) {
                Vertex<T> neighbor = edge.getEnd();
                depthFirstHelper(neighbor, visited, result);
            }
        }
    }}