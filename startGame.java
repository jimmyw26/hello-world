import java.util.Scanner;

import static java.lang.System.exit;

public class startGame {
    Scanner s = new Scanner(System.in);



    public void intro() {
        System.out.println("Welcome to the Java Calculator\n");
        System.out.println("What is your name? ");
        String name = s.nextLine();
        System.out.println("Hello " + name + "!\n");
        System.out.println("Which operator? : Addition(1) Subtraction(2) Multiplication(3) Division(4) Power(5)\n");
        System.out.println("What kind of operation would you like to do: ");
    }

    public void add(int add1, int add2) {
        int sol = add1 + add2;
        System.out.print("Your sum will be: " + sol);

    }

    public void sub(int sub1, int sub2) {
        int sol = sub1 - sub2;
        System.out.print("Your difference will be: " + sol);
    }

    public void mult(int mult1, int mult2) {
        int sol = mult1 * mult2;
        System.out.print("Your product will be: " + sol);
    }

    public void power(double base, double exponent)
    {
        double product = Math.pow(base, exponent);
        System.out.print("Your product will be: " + product);
    }

    public void div(int div1, int div2) {
        if (div2 == 0) {
            try {
                int und = div1 / div2;
            } catch (Exception und) {
                System.out.println("Your answer will be undefined");
                exit(0);
            }
        } else{
                int sol = div1 / div2;
                int rem = div1 % div2;

                System.out.print("Your quotient will be " + sol + " with a remainder of " + rem);
            }
        }
    }
