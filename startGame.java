public class startGame {




    public void intro(){
        System.out.println("Welcome to the Java Calculator\n");
        System.out.println("Addition(1) Subtraction(2) Multiplication(3) Division(4)\n");
        System.out.println("What kind of calculation would you like to do: ");
    }
    public void add(int add1 , int add2){
        int sol = add1 + add2;
        System.out.print("Your sum will be: " + sol);

    }
    public void sub(int sub1, int sub2){
        int sol = sub1 - sub2;
        System.out.print("Your difference will be: " + sol);
    }
    public void mult(int mult1, int mult2){
        int sol = mult1 * mult2;
        System.out.print("Your product will be: " + sol);
    }
    public void div(int div1, int div2){
        int sol = div1 / div2;
        int rem = div1 % div2;
        System.out.print("Your quotient will be: " + sol + " with a remainder of " + rem);
    }
}
