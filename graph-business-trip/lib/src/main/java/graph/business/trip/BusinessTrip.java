package graph.business.trip;

import java.util.List;
import java.util.Map;

public class BusinessTrip {
    public Integer businessTrip(Graph graph, List<String> cities) {
        int cost = 0;

        for (int i = 0; i < cities.size() - 1; i++) {
            String currentCity = cities.get(i);
            String nextCity = cities.get(i + 1);

            Map<String, Integer> neighbors = graph.getNeighbors(currentCity);

            if (neighbors.containsKey(nextCity)) {
                cost += neighbors.get(nextCity);
            } else {
                return null; // Direct flight not available
            }
        }

        return cost;
    }
}
