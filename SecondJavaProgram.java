import java.util.Scanner;

public class SecondJavaProgram {
    private static int num1;
    private static int num2;
    private static int num3;

    public static void highestNumber(){
        int result;
        if (num1 >= num2 && num1 >= num3){
            result = num1;
        }
        else if (num2 >= num1 && num2 >= num3){
            result = num2;
        }
        else {
            result = num3;
        }

        System.out.println("------------------------");
        System.out.println("Highest number is: "+result);
        System.out.println("------------------------");
        System.out.println("------------------------");
    }

    public static void numberOfTimes(){
        byte count1 = 1;

        if (num1 == num2){
            count1++;
            if (num1 == num3){
                count1++;
                System.out.println("The number "+num1+" was entered "+count1+" times");
            }
            else {
                System.out.println("The number "+num1+" was entered "+count1+" times, and the number "+num3+" was entered 1 time");
            }
        }
        else if (num1 == num3){
            count1++;
            System.out.println("The number "+num1+" was entered "+count1+" times, and the number "+num2+" was enteres 1 time");
        }
        else if (num2 == num3){
            count1++;
            System.out.println("The number "+num2+" was entered "+count1+" times, and the number "+num1+" was enteres 1 time");
        }
        else {
            System.out.println("You entered three different numbers");
        }
    }

    public static void main(String[] args) {

        System.out.println("RULES OF APP: Only input numbers between -32768 and 32767!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        SecondJavaProgram.num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        SecondJavaProgram.num2 = scan.nextInt();

        System.out.print("Enter third number: ");
        SecondJavaProgram.num3 = scan.nextInt();

        // Closing Scanner after the use
        scan.close();

        SecondJavaProgram.highestNumber();
        SecondJavaProgram.numberOfTimes();
    }
}
