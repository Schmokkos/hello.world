import java.util.Scanner;

public class SecondJavaProgram {

    public static void main(String[] args) {

        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);

        // This method reads the number provided using keyboard
        System.out.print("Enter any number: ");
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
