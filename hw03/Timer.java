import java.util.Scanner;
public class Timer {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the current time: ");
        int currentTime = myScanner.nextInt();
        
        System.out.print("Enter the time that you will be eating dinner: ");
        int dinnerTime = myScanner.nextInt();
        
        int timeLeft, hoursLeft, minutesLeft;
        
        timeLeft = dinnerTime - currentTime;
        hoursLeft= (int)(timeLeft/100);
        minutesLeft = timeLeft % 100;
        
        System.out.println("You have " + hoursLeft + " hours and " +minutesLeft+ " minutes until dinner.");
        
    }
}
