package ghraphs;

public class Edge<T> {
    private Vertex start;
    private Vertex end;
    private T weight;

    public Edge(Vertex start, Vertex end, T weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public T getWeight() {
        return weight;
    }
}
