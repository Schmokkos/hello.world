import java.util.Scanner;

public class SecondJavaProgram {

    public static void main(String[] args) {

        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        
		if(num > 10){
			System.out.println(num+" is more that 10...");
		}
		else{
		System.out.println("The number entered by user: "+num);	
		}
		
    }
}
