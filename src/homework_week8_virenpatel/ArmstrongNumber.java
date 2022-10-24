package homework_week8_virenpatel;
/* 10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.anyNumber();
    }
    public void anyNumber(){
        int n, count = 0, a, b, c, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any integer you want to check:");
        n = scanner.nextInt();
        a = n;
        c = n;
        while(a > 0)
        {
            a = a / 10;
            count++;
        }
        while(n > 0)
        {
            b = n % 10;
            sum = (int) (sum+Math.pow(b, count));
            n = n / 10;
        }
        if(sum == c)
        {
            System.out.println("Given number is Armstrong");
        }
        else
        {
            System.out.println("Given number is not Armstrong");
        }
        scanner.close();
    }
}
