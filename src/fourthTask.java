import java.util.Scanner;

public class fourthTask {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter the boolean: ");
        boolean b1=in.nextBoolean();


        if(b1 == true) {
            System.out.println("Opposite of true is false!");
        }   else {
            System.out.println("Opposite of false is true!");
        }
        }
}