package random;

import java.util.Random;
import java.util.Scanner;

public class RandomMain {

    private static Integer[] array;
    private static Random random = new Random();


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");

        Integer arraySize = scanner.nextInt();

        array = new Integer[arraySize];

        System.out.println("Selected numbers: ");
        contentOfTheArray(array);
        System.out.println("\nMin: ");
        minNumber(array);
        System.out.println("\nMax: ");
        maxNumber(array);
        System.out.println("\nAverage: ");
        average(array);
        System.out.println("\nReverse order: ");
        reverseOrder(array);

    }

    public static void contentOfTheArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
            System.out.print(array[i] + " ");
        }
    }

    public static void minNumber(Integer[] array) {

        Integer minNumber = array[0];
        for (Integer element : array) {
            if (element < minNumber) {
                minNumber = element;

            }

        }

        System.out.println(minNumber);

    }

    private static void maxNumber(Integer[] array) {

        Integer maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            Integer element = array[i];
            if (element > maxNumber) {
                maxNumber = element;

            }
        }
        System.out.println(maxNumber);
    }

    private static void average(Integer[] array) {

        Float result = 0.0f;
        int belowAverage = 0;
        int aboveAverage = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];

        }

        Float average = result / array.length;

        System.out.println(average);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                belowAverage++;

            } else {
                aboveAverage++;
            }

        }
        System.out.println("\nAmount of numbers below the average: " + belowAverage);
        System.out.println("\nAmount of numbers above the average: " + aboveAverage);

    }

    private static void reverseOrder(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[array.length - i - 1] + " ");

        }


    }


}
