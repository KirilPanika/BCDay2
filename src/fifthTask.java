import java.util.Scanner;

public class fifthTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please input number a: ");
        int a = in.nextInt();

        System.out.println("Please input number b: ");
        int b = in.nextInt();

        System.out.println("Number a is: " + a);
        System.out.println("Number b is: " + b);

        if(a==b || (a<0 && b>0) || (a>1001 && b>1001)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}