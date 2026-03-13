import java.util.*;

public class UseCase1PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean checkTwoPointer(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack approach
    public static boolean checkStack(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: String reverse
    public static boolean checkReverse(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String word = "racecar";

        long startTime, endTime;

        // Two pointer
        startTime = System.nanoTime();
        boolean result1 = checkTwoPointer(word);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + (endTime - startTime) + " ns");

        // Stack
        startTime = System.nanoTime();
        boolean result2 = checkStack(word);
        endTime = System.nanoTime();
        System.out.println("Stack Result: " + result2 + " | Time: " + (endTime - startTime) + " ns");

        // Reverse
        startTime = System.nanoTime();
        boolean result3 = checkReverse(word);
        endTime = System.nanoTime();
        System.out.println("Reverse Result: " + result3 + " | Time: " + (endTime - startTime) + " ns");

        System.out.println("Performance comparison completed.");
    }
}