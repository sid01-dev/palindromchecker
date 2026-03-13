// PalindromeChecker class encapsulating the palindrome logic
class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "Race Car";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(text);

        if (result) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}