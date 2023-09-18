import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int x = 5; // int allows for an integer to be initialized
        int num = 20;
        x ++; // adds 1 to x
        double t = 5.0; // double allows for decimals to be initialized
        double p = num += x;
        boolean z = true; // boolean can be true or false

        System.out.println("Hello and welcome!");
        System.out.println(p);
        System.out.print(number);

        }
    }
