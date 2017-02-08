import java.util.Scanner;
public class Problem4_20 {
    public static void main(String[] args) {
    	// Create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = input.nextLine();
        System.out.println("The length is: " + str.length());
        System.out.println("The first char is: " + str.charAt(0));
    }
}