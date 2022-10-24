package homework_week8_virenpatel;
/* 14. Write a program in Java to display the pattern like a diamond.
 While loop
            *
           ***
          *****
         *******
        *********
       ***********
      *************
       ***********
        *********
         *******
          *****
           ***
            *
 */
import java.util.Scanner;

public class DiamondWhileLoop {
    public static void main(String[] args) {
        DiamondWhileLoop obj = new DiamondWhileLoop();
        obj.diamond();
    }
    public void diamond(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int n = scanner.nextInt();
        System.out.print("Enter Symbol : ");
        char c = scanner.next().charAt(0);
        int i = 1;
        int j;
        while (i <= n) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i--;
        }
        scanner.close();

    }
}
