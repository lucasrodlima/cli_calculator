package main;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float num1, num2, result = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            num1 = scanner.nextFloat();

            System.out.println("Enter another number:");
            num2 = scanner.nextFloat();

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            System.out.println("Select an operation by typing a number.");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Improper input.");
                    break;
            }

            System.out.println("Result is: " + result);

            System.out.println("Type 0 to quit the application or press Enter to continue.");

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                continue;
            }
            int option2 = Integer.parseInt(input);

            if (option2 == 0) {
                break;
            }
        }
    }
}
