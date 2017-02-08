import java.util.Scanner;
 
public class Problem3_5 {
    public static void main(String[] args) {
        String today;
        String futureday;
         //Create a scanner onject
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter today's day: ");
        int day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int numofdays = input.nextInt();
         
        int futureDate = (day + numofdays) % 7;
        
        //to get todays date
        if (day == 0){
            today = "Sunday";
        }else if (day == 1){
            today = "Monday";
        }else if (day == 2){
            today = "Tuesday";
        }else if (day == 3){
            today = "Wednesday";
        }else if (day == 4){
            today = "Thursday";
        }else if (day == 5){
            today = "Friday";
        }else {
            today = "Saturday";
        }
         
        //To get future date
        if (futureDate == 0){
            futureday = "Sunday";
        }else if (futureDate == 1){
            futureday = "Monday";
        }else if (futureDate == 2){
            futureday = "Tuesday";
        }else if (futureDate == 3){
            futureday = "Wednesday";
        }else if (futureDate == 4){
            futureday = "Thursday";
        }else if (futureDate == 5){
            futureday = "Friday";
        }else{
            futureday = "Saturday";
        }
        
        System.out.println("Today is " + today + " and the future day is " + futureday);
    }
}