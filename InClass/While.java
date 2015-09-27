//Sum all numbers between 0 and 10
import.java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number: ")
        int n = scan.hasNextInt();
       
        while(!scan.hasNextInt()) {
            System.out.println(scan.hasNextInt());
            
        }
        int i= scan.hasNextInt();
    }
}