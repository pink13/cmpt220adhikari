import java.util.Scanner;
 
public class Problem2_9 {
    public static void main (String[] args) {
      	//Create a scanner object
        Scanner input = new Scanner(System.in);
    	System.out.print("Enter v0, v1 and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        //Using the given formula
        double average = (v1 - v0) / t;
         
        System.out.println("The average acceleration is " + average );
        
    }
}