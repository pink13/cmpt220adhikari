import java.util.Scanner;

public class Problem18_7 {
	static long count; // To count the number of time the method is called

    public static void main(String args[]) {

        System.out.print("Enter an index for the Fibonacci number: ");
        int index = new Scanner(System.in).nextInt();

        System.out.println(
                "Fibonacci number at index " + index + " is " + fib(index));

        System.out.println("The fib method was called " + count + " times");
    }

    //method that returns the number of the index entered by the user
    public static long fib(long index) {
        count++; 
        if (index == 0) // Base case
            return 0;
        else if (index == 1) // Base case
            return 1;
        else  // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
    }
}
