package palindrome;

import java.util.Scanner;

public class PalindromeMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter text to check: ");

        String text = scanner.next();

        boolean isPalindrome = true;

        for (int i = 0; i < (text.length() / 2) + 1; i++) {
            char firstChar = text.charAt(i);
            char lastChar = text.charAt(text.length() - 1 - i);
            if (firstChar != lastChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }

    }
}
