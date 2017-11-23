package caesar_encryption;

import java.util.Scanner;

public class CaesarEncryptionMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Enter text to encrypt: ");

        String text = scanner.next();

        System.out.println("Enter number of position to move: ");

        int numberToMove = scanner.nextInt();

        char encryptedText;

        for (int i = 0; i < text.length(); i++) {

            encryptedText = text.charAt(i);
            encryptedText += numberToMove;
            System.out.print(encryptedText);

        }

    }



}
