import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter first b1 boolean: ");
        boolean b1=in.nextBoolean();

        System.out.print("Enter second b2 boolean: ");
        boolean b2=in.nextBoolean();

        System.out.println("Number a is: " + b1);
        System.out.println("Number b is: " + b2);

        System.out.println("Is b1 and b2 equal? = " + (b1==b2) );
    }
}

