package AllSbcCodingQue;

import java.util.*;

public class FirstUniqueCharacter {

    public static int firstUniqueChar(String str) {
        int index = -1;
        Map<Character, Integer> charFreqMap = new HashMap<>();

        // Update the map
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Get the current frequency
            int freq = charFreqMap.getOrDefault(c, 0);

            // Update the map
            charFreqMap.put(c, freq + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (charFreqMap.get(str.charAt(i)) == 1) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String str =  "FourByFourFrog";
        System.out.println( firstUniqueChar(str) );

    }

}
