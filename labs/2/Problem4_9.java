import java.util.Scanner;

public class Problem4_9 {
    public static void main(String[] args) {
    	//Create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String word = input.nextLine();
        char ch = word.charAt(0);
        int ascii = ch;
        System.out.println("The ascii for the character " + ch + " is " + ascii);
    }
}