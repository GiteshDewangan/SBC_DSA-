package Accenture2;

public class LexicographicComparison {
    public static void main(String[] args) {
            String S1 = "SHOURyA";
            String S2 = "SaurOBH";

            int result = compareStrings(S1, S2);
            System.out.println(result);
    }

        public static int compareStrings(String S1, String S2) {
            // Convert both strings to lowercase for case-insensitive comparison
            String lowerS1 = S1.toLowerCase();
            System.out.println( lowerS1);
            String lowerS2 = S2.toLowerCase();
            System.out.println( lowerS2);

            // Compare the two lowercase strings
            if (lowerS1.equals(lowerS2)) {
                return 0; // Both strings are equal
            } else if (lowerS1.compareTo(lowerS2 )< 0)  {
                return -1; // First string is smaller
            } else {
                return 1; // Second string is smaller
            }
        }
}


