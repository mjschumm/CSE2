//Mark Schumm
//Lab 07
//This code outprints an x with a square of stars.
//The user enters an input and this input becomes the dimensions of the square
//The outer for loop determines the number of rows to be printed
//The inner for loop sets the placement for the spaces using and if statement
import java.util.Scanner;

public class encrypted_x {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter a number: ");
        int input = myScanner.nextInt();
        if (input<0||input>100){
            System.exit(-1);
        }
        else {
            for(int i=1;i<=input;i++) {
                for(int j=1;j<=input;j++) {
                    if (j==i||j==input-i+1){
                        System.out.print(" ");
                    }
                    else {
                    System.out.print("*");
                    }
                }
             System.out.println( );  
            }
        }
    }
}
