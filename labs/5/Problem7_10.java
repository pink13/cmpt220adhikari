import java.util.Arrays;
	import java.util.Scanner;
public class Problem7_10{
	

	    public static void main(String[] args) {
	        double[] numbers = new double[10];
	        //Creating Scanner object
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter 10 numbers: ");
	        for (int i = 0; i < numbers.length; i++) {
	        numbers[i] = input.nextDouble();
	        }
	        int index = indexOfSmallestElement(numbers);
	        
	        //To display the data to user in proper format
	        System.out.println("The smallest number is " + numbers[index] + " and its index is: " + index);
	    }
	    
	    //To find the index of smallest element
	    public static int indexOfSmallestElement(double[] array) {
	        int pos = 0;
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < array[pos]) {
	            	pos = i;
	            }
	        }
	        return pos;
	    }
	}


