import java.util.Scanner;

public class Problem18_17 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of characters in one line: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        char[] chars = s.replaceAll(" ", "").toCharArray();
        System.out.println("The occurrences of '" + ch + "' in \"" + s + "\" = " + count(chars, ch));
    }
	
	// Method to pass and return value of other count method
    private static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }
    
    // method to count occurence
    private static int count(char[] chars, char ch, int high) {

        int count = (chars[high] == ch) ? 1 : 0;

        if (high == 0)
            return count;
        else
            return count + count(chars, ch, high - 1);
    }

}
