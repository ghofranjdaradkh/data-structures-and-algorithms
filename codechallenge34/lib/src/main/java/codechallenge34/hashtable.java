package codechallenge34;

import java.util.HashSet;

public class hashtable {
    public static boolean hasUniqueCharacters(String inputString) {

        if (inputString.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty");}
        HashSet<Character> uniqueSet = new HashSet<>();
        for (char character : inputString.toCharArray()) {

            char lowercaseChar = Character.toLowerCase(character);

            if (lowercaseChar != ' ') {

                if (uniqueSet.contains(lowercaseChar)) {
                    return false;
                } else {

                    uniqueSet.add(lowercaseChar);
                }
            }
        }

        return true;
    }
}
