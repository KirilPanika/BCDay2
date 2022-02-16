import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please input number a! ");
        int a = in.nextInt();

        System.out.println("Please input number b! ");
        int b = in.nextInt();

        System.out.println("Number a is: " + a);
        System.out.println("Number b is: " + b);

        System.out.println("Is "+ a + " equal to "+ b +"? - "+ (a==b) );
        System.out.println("Is "+ a + " less than "+ b +"? - "+ (a<b) );
        System.out.println("Is "+ a + " less or equal "+ b +"? - "+ (a<=b) );
        System.out.println("Is "+ a + " greater than "+ b +"? - "+ (a>b) );
        System.out.println("Is "+ a + " greater or equal to "+ b +"? - "+ (a>=b) );
    }
}
