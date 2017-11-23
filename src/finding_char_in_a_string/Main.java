package finding_char_in_a_string;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Enter string: ");
        String characters = scanner.next();

        char lastCharacter = characters.charAt(characters.length() - 1);
        System.out.println("Last character of a string: " + lastCharacter);

        int count = 0;
        for (int i = 0; i < characters.length(); i++) {
            if (characters.charAt(i) == lastCharacter) {
                count++;
            }
        }

        System.out.println("Number of occurrences : " + count);

    }


}
