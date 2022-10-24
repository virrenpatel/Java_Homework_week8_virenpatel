package homework_week8_virenpatel;
/* 15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */
import java.util.Scanner;

public class LeftAngleTriangle {
    public static void main(String args[]) {
        LeftAngleTriangle obj = new LeftAngleTriangle();
        obj.leftTriangle();
    }
    public void leftTriangle(){
        int i, j, my_input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        my_input = scanner.nextInt();
        System.out.println("The left triangle star pattern : ");
        for(i=0; i<my_input; i++){
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
