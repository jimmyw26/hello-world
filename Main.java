import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Calculator\n");
        System.out.println("Addition(1) Subtraction(2) Multiplication(3) Division(4)\n");
        System.out.println("What kind of calculation would you like to do: ");
        int calculation = scanner.nextInt();
        if (calculation == 1) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            int sum = x + y;
            System.out.print("Your sum will be: " + sum);

        } else if (calculation == 2) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            int difference = x / y;
            System.out.print("Your difference will be " + difference);

        } else if (calculation == 3) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            int product = x * y;
            System.out.print("Your product will be " + product);
        } else if (calculation == 4) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            int quotient = x / y;
            int remainder = x % y;
            System.out.print("Your quotient will be " + quotient + " with a remainder of " + remainder);

        }

        else  {


            System.out.println(String(calculation) + " isn't one of the options");

        }

    }
}
