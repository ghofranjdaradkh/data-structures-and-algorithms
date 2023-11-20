package ghraphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int id;
    private List<Node> neighbors;

    public Node(int id) {
        this.id = id;
        this.neighbors = new ArrayList<>();
    }
}