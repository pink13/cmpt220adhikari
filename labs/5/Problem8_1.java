import java.util.Scanner;
public class Problem8_1 {
	 public static void main(String[] args) {
	        double[][] matrix = getMatrix(3, 4);
	        for (int i = 0; i < matrix[0].length; i++) {
	            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
	        }
	    }

	    public static double[][] getMatrix(int rows, int columns){
	    	//Creating scanner object
	        Scanner input = new Scanner(System.in);
	        double[][] matrix = new double[rows][columns];
	        System.out.println("Enter a 3-by-4 matrix row by row:");
	        
	        //Saving on proper indices of matrix
	        for (int r = 0; r < rows; r++) {
	            for (int c = 0; c < columns; c++) {
	                matrix[r][c] = input.nextDouble();
	            }
	        }
	        return matrix;
	    }
	    
	    //Calculating the sum
	    public static double sumColumn(double[][] m, int columnIndex) {
	        double sum = 0;
	        for (double[] aM : m) {
	            sum += aM[columnIndex];
	        }
	        return sum;
	    }
	}


