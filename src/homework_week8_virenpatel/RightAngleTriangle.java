package homework_week8_virenpatel;
/* 8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */
import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        RightAngleTriangle obj = new RightAngleTriangle();
        obj.rightTriangle();
    }
    public void rightTriangle(){
        Scanner scanner = new Scanner(System.in);
        char triangleChar;
        int triangleHeight;

        System.out.println("Enter a character:");
        triangleChar = scanner.next().charAt(0);

        System.out.println("Enter triangle height:");
        triangleHeight = scanner.nextInt();

        int counter = 1;//Counts the number of chars for each line
        for (int i = 0; i < triangleHeight; i++) {
            String currentLine = "";
            for (int j = 0; j < counter; j++) {
                currentLine += triangleChar + " ";
            }
            System.out.println(currentLine);
            counter++;
        }
        scanner.close();
    }
}