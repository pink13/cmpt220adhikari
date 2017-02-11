package my.java;
import java.util.*;

public class Problem5_1
{
  public static void main(String arg[])
  {
		
    System.out.print("Enter an integer, the input ends if it is 0: ");
    // Create a scanner object
    Scanner in = new Scanner(System.in);
    int p=0,n=0,g=0;
    double a=0,t=0;
    
    // Using loop to calculate
    do
    {
      g=in.nextInt();
      if(g==0)
      continue;
      if(t>0) // JA: This should had been g, not t
      {
        p++;
      }
      else
      {
        n++;
      }
      t+=(double)g;
    }while(g!=0);
    System.out.println("The number of positives is "+p);
    System.out.println("The number of negatives is "+n);
    System.out.println("The total is "+t);
    System.out.println("The average is "+(t/(p+n)));
  }
}