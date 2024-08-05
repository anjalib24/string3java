// Question no 8
import java.util.HashMap;

import java.util.Map;

public class LastUniqueCharacter {
    public static void main(String[] args) {
        String input = "example string with unique characters";
        char lastUniqueChar = findLastUniqueCharacter(input);
        
        if (lastUniqueChar != '\0') {
            System.out.println("The last unique character in the string is: " + lastUniqueChar);
        } else {
            System.out.println("No unique character found in the string.");
        }
    }

    public static char findLastUniqueCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        Map<Character, Integer> charLastIndexMap = new HashMap<>();

        // Count occurrences of each character and store their last index
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            charLastIndexMap.put(c, i);
        }

        // Find the last unique character
        int lastUniqueIndex = -1;
        char lastUniqueChar = '\0';
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                int index = charLastIndexMap.get(entry.getKey());
                if (index > lastUniqueIndex) {
                    lastUniqueIndex = index;
                    lastUniqueChar = entry.getKey();
                }
            }
        }

        return lastUniqueChar;
    }
}
