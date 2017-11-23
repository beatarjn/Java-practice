package position_of_character_in_a_string;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.next();
        System.out.println("Enter character: ");
        char character = scanner.next().charAt(0);

        System.out.println(Arrays.toString(findPosition(text, character)));

    }

    public static int[] findPosition(String text, char character) {

        int[] tab = new int[0];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                tab = Arrays.copyOf(tab, tab.length + 1);
                tab[tab.length - 1] = i;
            }
        }

        return tab;

    }

}
