import java.util.Scanner;

public class Problem4_13 {
    public static void main(String[] args) {
    	//Create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        
        //To check if the first character is vowel or not
        char ch = input.nextLine().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}