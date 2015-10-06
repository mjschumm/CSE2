//Mark Schumm
//Hw06 10/3/15
//Pyramid
//This program will have a user input a number
//The number will determine the number of levels in
//the printed pyramid
//4 nested for loops are used.  The first counters the 
//number of levels.  The second loop determines 
//how many spaces to put on the line 
//The third and fourth loops determine how many * to place on
//each line.  The print statements are without the ln
//because the spaces and stars should be printed
//on the same line.  After the 3 inner for loops are run
//a print ln( ) statement is used to return to a 
//next line before the outermost for loop runs again. 
import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter a number: ");
        int number = myScanner.nextInt();
        
        for (int i=1; i<=number; i++) {
            for(int j=1; j<=number-i;j++){
                System.out.print(" ");
            }
            for(int k=number-i;k<number;k++) {
                System.out.print("*");
            }
                for(int l=number-i;l<number-1;l++) {
                    System.out.print("*");
                }
                System.out.println( );
        }
    }
}