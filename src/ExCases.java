import java.util.Scanner;

public class ExCases {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 10: ");
        int key = input.nextInt();

        switch (key) {
            case 1:
                System.out.println("You have successfully able to unlock room number 1");
                break;
            case 2:
                System.out.println("You have successfully able to unlock room number 2");
                break;
            default:
                System.out.println("Sorry, only first two rooms available, your " + key + " is taken;");
                break;
        }

        System.out.println("Please input the day of the week is today");
        String dayOfWeek = input.next();
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
                System.out.println("Let's go to work");
                break;
            case "Wednesday":
                System.out.println("It is a day off as it is 16th of February 2022 and it is Bank Holiday in Lithuania!");
                break;
            default:
                System.out.println("Sorry, didn't recognise");
        }
    }
}