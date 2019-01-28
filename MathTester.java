import java.util.Scanner;
import java.util.Random;

public class MathTester {

    public static void main(String[] args){

        System.out.println("Welcome to Math Tester 1.0 :)");
        System.out.println("*******************");

        Scanner scan = new Scanner(System.in);
        Random rnum = new Random();

        int num1 = rnum.nextInt(200);
        int num2 = rnum.nextInt(200);

        System.out.println("What is: "+num1+"+"+num2+" ?");
        int result1 = scan.nextInt();

        if (result1 == num1+num2){
            System.out.print("Correct!");
        }
        else {
            System.out.print("Wrong! Correct answer was: "+(num1+num2));
        }

        // Closing Scanner after the use
        scan.close();
    }
}