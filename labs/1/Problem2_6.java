import java.util.Scanner;

public class Problem2_6 {
  public static void main(String[] args) {
  	//Create a scanner object
    Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer between 0 and 1000: ");
    int number = input.nextInt();
    
    //Finding the digits
    int remainder = number % 10;
    int divisor = number / 10;
    int remainder2 = divisor % 10;
    divisor = divisor / 10;
    int remainder3 = divisor % 10;

    //Finding the sum of digits
    int sum = remainder + remainder2 + remainder3;

    System.out.println("The sum of all digits in " + number + " is " + sum);
  }
}
