import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startGame s = new startGame();
        s.intro();
        String operation = scanner.nextLine();
        if (Objects.equals(operation, "1")) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            s.add(x, y);

        } else if (Objects.equals(operation, "2")) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            s.sub(x, y);

        } else if (Objects.equals(operation, "3")) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            s.mult(x, y);
        } else if (Objects.equals(operation, "4")) {
            System.out.println("Enter your first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter your second number: ");
            int y = scanner.nextInt();
            s.div(x, y);

        } else {

            System.out.println("Not one of the options");

        }
    }
}
