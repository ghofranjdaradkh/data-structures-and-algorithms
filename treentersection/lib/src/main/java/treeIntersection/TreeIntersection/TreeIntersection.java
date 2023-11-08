package treeIntersection.TreeIntersection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TreeIntersection {


    public Set<Integer> findCommonValues(Node root1, Node root2) {
        Set<Integer> result = new HashSet<>();
        Map<Integer, Integer> valuesMap = new HashMap<>();

        // Populate the HashMap with values from the first tree
        populateValuesMap(root1, valuesMap);

        // Traverse the second tree and check for common values
        findCommonValuesInTree(root2, valuesMap, result);

        return result;
    }

    private void populateValuesMap(Node node, Map<Integer, Integer> values) {
        if (node != null) {
            values.put(node.data, values.getOrDefault(node.data, 0) + 1);
            populateValuesMap(node.left, values);
            populateValuesMap(node.right, values);
        }
    }

    private void findCommonValuesInTree(Node node, Map<Integer, Integer> values, Set<Integer> result) {
        if (node != null) {
            if (values.containsKey(node.data) && values.get(node.data) > 0) {
                result.add(node.data);
                values.put(node.data, values.get(node.data) - 1);
            }
            findCommonValuesInTree(node.left, values, result);
            findCommonValuesInTree(node.right, values, result);
        }
    }}









