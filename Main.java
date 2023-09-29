import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static <ArithemticException extends Throwable> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startGame s = new startGame();
        s.intro();
        String operation = scanner.nextLine();
        if (Objects.equals(operation, "1")) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            s.add(x,y);

        } else if (Objects.equals(operation, "2")) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            s.sub(x,y);

        } else if (Objects.equals(operation, "3")) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            s.mult(x,y);
        } else if (Objects.equals(operation, "4")) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            if (y == 0) {
                try {
                    int ae = x / y;
                } catch (ArithmeticException ae) {
                    System.out.println("Your answer will be undefined");
                    exit(0);
                }
                int quotient = x / y;
                int remainder = x % y;
                System.out.print("Your quotient will be " + quotient + " with a remainder of " + remainder);

            } else {

                System.out.println(operation + " isn't one of the options");

            }

        }
    }
}
