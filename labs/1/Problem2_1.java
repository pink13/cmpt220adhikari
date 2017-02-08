import java.util.Scanner;

public class Problem2_1 {
public static void main(String[] args) {
	System.out.print("Enter a degree in Celsius: ");
	
	//Create a scanner object
	Scanner input = new Scanner(System.in);
	double celsius = input.nextDouble();
	
	//Using the formula to convert Celsius to Fahrenheit
	double fah = (( 9 * celsius ) / 5 )+ 32;
	
	System.out.println(celsius + " celsius is " + fah + "fahrenheit");
		
}
}
