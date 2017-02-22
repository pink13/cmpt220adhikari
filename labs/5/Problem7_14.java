
import java.util.Scanner;
public class Problem7_14 {
public static void main(String[] args) {
    	
    	//Creating Scanner object
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The greatest commond divider is: " + gcd(numbers));
    }
    
    private static String gcd(int[] numbers) {
	// TODO Auto-generated method stub
	return null;
}

	// TO find the minimum value
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

}
