import java.util.Scanner;

public class Calculator {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first operand: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter second operand: ");
        double num2 = scan.nextDouble();
        //input integers

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        //calculator menu

        System.out.println("Which operation do you want to perform? ");
        int choice = scan.nextInt();
        //choice

        double addition;
        double subtraction;
        double multiplication;
        double division;

        if (choice == 1) {
            addition = num1 + num2;
            System.out.println("The result of the operation is " + addition + ". Goodbye!");
        }
        if (choice == 2) {
            subtraction = num1 - num2;
            System.out.println("The result of the operation is " + subtraction + ". Goodbye!");
        }
        if (choice == 3) {
            multiplication = num1 * num2;
            System.out.println("The result of the operation is " + multiplication + ". Goodbye!");
        }
        if (choice == 4) {
            division = num1 / num2;
            System.out.println("The result of the operation is " + division + ". Goodbye!");
        }
        if (choice > 4) {
            System.out.println("Error: Invalid selection! Terminating program.");
        }

         if (choice < 1)   {
             System.out.println("Error: Invalid selection! Terminating program.");
         }
            //if statements


    }
}
