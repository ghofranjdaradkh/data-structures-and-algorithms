package graph.business.trip;

import java.util.Arrays;
import java.util.List;

public class Library {
    public static void main(String[] args) {

        BusinessTrip businessTrip=new BusinessTrip();
        Graph graph=new Graph();
        // Add edges to the graph
        graph.addEdge("Metroville", "Pandora", 82);
        graph.addEdge("Arendelle", "New Monstropolis", 45);
        graph.addEdge("New Monstropolis", "Naboo", 70);
        graph.addEdge("Naboo", "Metroville", 115);
        graph.addEdge("Narnia", "Arendelle", 37);
        graph.addEdge("Narnia", "Naboo", 120);

        // Test cases
        List<String> trip1 = Arrays.asList("Metroville", "Pandora");
        List<String> trip2 = Arrays.asList("Arendelle", "New Monstropolis", "Naboo");
        List<String> trip3 = Arrays.asList("Naboo", "Pandora");
        List<String> trip4 = Arrays.asList("Narnia", "Arendelle", "Naboo");

        System.out.println(businessTrip.businessTrip(graph, trip1)); // Output: 82
        System.out.println(businessTrip.businessTrip(graph, trip2)); // Output: 115
        System.out.println(businessTrip.businessTrip(graph, trip3)); // Output: null
        System.out.println(businessTrip.businessTrip(graph, trip4)); // Output: null
    }}