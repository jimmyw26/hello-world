import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startGame p = new startGame();
        Scanner rest = new Scanner(System.in);
        boolean yesno = true;
        while(yesno == true)
        {
            p.mainGame();
            System.out.println("\n\nWould you like to reuse the Java Calculaotr? (y/n)");
            String yesorno = rest.nextLine();
            if(Objects.equals(yesorno, "y")) {
                yesno = true;
            }
            if(Objects.equals(yesorno, "n"))
            {
                System.out.println("See you next time user!");
                yesno = false;
            }
        }
    }
}
