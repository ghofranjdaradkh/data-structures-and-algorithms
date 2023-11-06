package hashmap.repeated;

import java.util.HashMap;

public class hashMapReapeted {
    public  String repeatedWord(String inputString) {

        String[] words = inputString.split("\\s+");
        HashMap<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {

            word = word.replaceAll("[.,!?;:]", "").toLowerCase();
            if (wordFreq.containsKey(word)) {
                return word;
            } else {
                wordFreq.put(word, 1);
            }
        }

        return null;
    }
}
