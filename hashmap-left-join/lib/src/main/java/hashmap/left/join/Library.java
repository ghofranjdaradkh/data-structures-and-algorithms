/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.left.join;

import java.util.HashMap;
import java.util.Map;

public class Library {
    public static void main(String[] args) {

        Map<String, String> synonymsMap = new HashMap<>();
        synonymsMap.put("diligent", "employed");
        synonymsMap.put("fond", "enamored");
        synonymsMap.put("guide", "usher");
        synonymsMap.put("outfit", "garb");
        synonymsMap.put("wrath", "anger");

        Map<String, String> antonymsMap = new HashMap<>();
        antonymsMap.put("diligent", "idle");
        antonymsMap.put("fond", "averse");
        antonymsMap.put("guide", "follow");
        antonymsMap.put("flow", "jam");
        antonymsMap.put("wrath", "delight");

        joinLeft leftJoinInstance = new joinLeft();
        Map<String, String[]> result = leftJoinInstance.leftJoin(synonymsMap, antonymsMap);


        for (Map.Entry<String, String[]> entry : result.entrySet()) {
            String word = entry.getKey();
            String synonym = entry.getValue()[0];
            String antonym = entry.getValue()[1];

            System.out.println(word + " "+ synonym +" " + antonym);
        }

    }}
