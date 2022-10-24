package homework_week8_virenpatel;
/* 2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
 */
import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.readNumbers();
    }
    public void readNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number (or -1 to stop): ");
        int number = scanner.nextInt();
        int max = number;
        int min = number;

        while (number != -1) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            System.out.print("Type a number (or -1 to stop): ");
            number = scanner.nextInt();
        }

        if ( max != -1 && min != -1) {
            System.out.println("Maximum was " + max);
            System.out.println("Minimum was " + min);
        }
        scanner.close();
    }
}
