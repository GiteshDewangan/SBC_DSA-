package Accenture2;

import java.util.Scanner;

public class LongestSubstringWithoutDot {

    public static int longestSubstringWithoutDot(String input) {
        int maxLength = 0;
        int currentLength = 0;

        for (char ch : input.toCharArray()) {
            if (ch != '.') {
                currentLength++;
            } else {
                // If a dot is encountered, update maxLength and reset currentLength
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            }
        }

        // Make sure to check one last time in case the longest substring is at the end
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int result = longestSubstringWithoutDot(input);
        System.out.println("The length of the longest substring without interruptions is: " + result);

        scanner.close();
    }
}