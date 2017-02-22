import java.util.Scanner;
public class Problem8_5 {
	static int number = 1; //For storing the number of matrix
    public static void main(String[] args) {
        double[][] matrix1 = getMatrix(3, 3);
        double[][] matrix2 = getMatrix(3, 3);
        double[][] sum = addMatrix(matrix1, matrix2);
        System.out.println("The matrices are added as follows");
        displaySum(matrix1, matrix2, sum);
    }

    public static double[][] getMatrix(int rows, int columns) {
        double[][] m = new double[rows ][columns];
        //Creating scanner object
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix" + number +": ");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                m[r][c] = input.nextDouble();
            }
        }
        number++;
        return m;
    }

    // way to add matrices and storing in sum array
    public static double[][] addMatrix(double[][] a, double[][] b) {
        if (a.length == 0){
        	return null;
        }
        if (a.length != b.length){
        	return null;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[0].length != b[i].length) {
            	return null;
            }
        }
        double[][] sum = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static void displaySum(double[][] addend1, double[][] addend2, double[][] sum){
    	//To display the first matrix
        for (int i = 0; i < addend1.length; i++) {
            for (int j = 0; j < addend1[0].length; j++) {
                System.out.printf("%4.1f ", addend1[i][j]);
            }
            System.out.print(i == addend1.length / 2 ? " +  " : "    ");
            //To display the Second matrix
            for (int j = 0; j < addend2[0].length; j++) {
                System.out.printf("%4.1f ", addend2[i][j]);
            }
            //To display the sum of Matrices
            System.out.print(i == addend1.length / 2 ? " =  " : "    ");
            for (int j = 0; j < sum[0].length; j++) {
                System.out.printf("%4.1f ", sum[i][j]);
            }
            System.out.println();
        }
    }
}


