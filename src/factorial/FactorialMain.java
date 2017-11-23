package factorial;


import java.util.Scanner;

public class FactorialMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number, for which factorial will be calculated: ");

        Integer number = scanner.nextInt();
        System.out.println("Factorial Recursive: " + factorialRecursive(number));
        System.out.println("Factorial Iterative: " + factorialIterative(number));

    }

    public static int factorialRecursive(int number) {
        if (number == 1) {
            return 1;
        } else {
            return (number * (factorialRecursive(number - 1)));
        }

    }

    public static int factorialIterative(int number) {

        Integer result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;

    }
}
