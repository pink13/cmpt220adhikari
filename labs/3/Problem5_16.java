package my.java;

import java.util.Scanner;

public class Problem5_16 {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive Integer: ");
        int num = input.nextInt();
        
        // To print factorial
        while(num > 1){
            int i = 2;
            while (num % i != 0) i++;
            System.out.print(i);
            if (num != i) System.out.print(", ");
            num /= i;
        }
    }
}