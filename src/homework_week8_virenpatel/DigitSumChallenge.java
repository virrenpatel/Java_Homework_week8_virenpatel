package homework_week8_virenpatel;
/* 4. Digit Sum Challenge
Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit, so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 */
import java.util.Scanner;

public class DigitSumChallenge {

    public static int sumDigits(final int a) {
        int sum = 0;
        int n = a;
        do {
            sum += n % 10;
            n = n / 10;
        } while (n > 0);

        if (sum >= 10) {
            return sumDigits(-1);
        }

        return sum;
    }
    public static void main(final String[] args) {

        double sumDigit;
        int integer;
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            integer = scanner.nextInt();
            sumDigit = sumDigits(integer);
            System.out.println("The sum of the digit is: " + sumDigit);
            scanner.close();
        }


    }
}
