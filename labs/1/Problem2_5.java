import java.util.Scanner;
 
public class Problem2_5 {
	public static void main (String[] args) {
    	//Create a scanner object
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the subtotal and a gratuity rate: ");
    	double sttl = input.nextDouble();
        double r = input.nextDouble();
        
        //Using the formula
        double g = r / 10;
        double ttl = sttl + g;
         
        System.out.println("The gratuity is $" + g + " and total is $" + ttl);
        
    }
}