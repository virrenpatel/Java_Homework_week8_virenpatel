package homework_week8_virenpatel;
/* 6. Write a program in Java to display the pattern like a triangle with a number.
 For e.g.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910
 */
import java.util.Scanner;

public class DisplayTriangleWithNumber {
    public static void main(String[] args) {
    DisplayTriangleWithNumber obj = new DisplayTriangleWithNumber();
    obj.triangle();
    }
    public void triangle(){
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
        scanner.close();
    }
}
