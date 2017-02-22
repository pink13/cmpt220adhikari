import java.util.Scanner;
public class Problem7_19 {
	 public static void main(String[] args) {
	        //Creating Scanner object
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter list: ");
	        int getLength = input.nextInt();
	        int[] list = new int[getLength];
	        for (int i = 0; i < list.length; i++) {
	            list[i] = input.nextInt();
	        }
	        
	        //Display the result to user
	        if(isSorted(list)){
	            System.out.println("The list is already sorted");
	        } else {
	            System.out.println("The list is not sorted");

	        }
	        }
	    
	    //To check if the list is sorted or not
	    public static boolean isSorted(int[] list) {
	        for (int i = 0; i < list.length - 1; i++) {
	            if (list[i] > list[i + 1]) {
	            	return false;
	            }
	        }
	        return true;
	    }
	}


