import java.util.Scanner;

public class Problem7_11 {
	 public static void main(String[] args) {
	        double[] numbers = new double[10];
	        // Creating scanner object
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter ten numbers: ");
	        for (int i = 0; i < numbers.length; i++) {
	        	numbers[i] = input.nextDouble();
	        }
	        
	        // To display 2 digits after "."
	        System.out.printf("The mean is %.2f%n", mean(numbers));
	        
	        // To display 5 digits after "."
	        System.out.printf("The standard deviation is %.5f%n", deviation(numbers)); 
	    }

	    // By using formula to calculate deviation
	    public static double deviation(double[] x) {
	        double mean = mean(x);
	        double sum = 0;
	        for (double v : x) {
	            sum = sum + Math.pow(v - mean, 2);
	        }
	        double dev = Math.sqrt(sum / (x.length - 1));
	        return dev;
	    }

	    // By using the formula o calculate mean
	    public static double mean(double[] x) {
	        double sum = 0;
	        for (double v : x) {
	            sum = sum + v;
	        }
	        double mean = sum / x.length;
	        return mean;
	    }
	

}


