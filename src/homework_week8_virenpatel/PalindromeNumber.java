package homework_week8_virenpatel;
/* 5. Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212.
 */
public class PalindromeNumber {
    public static void main(String [] args){
    PalindromeNumber obj = new PalindromeNumber();
    obj.isPalindrome();
    }
    public boolean isPalindrome() {
        int lastDigit, sum = 0, num;
        int inputNumber = 707; //It is the number  to be checked for palindrome
        num = inputNumber;
        // Code to reverse a number
        while (num > 0) {
            System.out.println("Input Number " + num);
            lastDigit = num % 10; //getting remainder
            System.out.println("Last Digit " + lastDigit);
            System.out.println("Digit " + lastDigit + " was added to sum " + (sum * 10));
            sum = (sum * 10) + lastDigit;
            num = num / 10;
        }
        // if given number equal to sum than number is palindrome otherwise not palindrome
        if (sum == inputNumber)
            System.out.println("Number is palindrome ");
        else
            System.out.println("Number is not palindrome");
        return false;
    }
}
