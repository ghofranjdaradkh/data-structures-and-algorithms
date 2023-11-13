package hashmap.left.join;

import java.util.HashMap;
import java.util.Map;

public class joinleft {
    public static Map<String, String[]> leftJoin(Map<String, String> synonyms, Map<String, String> antonyms) {
        Map<String, String[]> result = new HashMap<>();

        for (String key : synonyms.keySet()) {
            String synonym = synonyms.get(key);
            String antonym = antonyms.getOrDefault(key, null);
            result.put(key, new String[]{synonym, antonym});
        }

        return result;
    }
}
