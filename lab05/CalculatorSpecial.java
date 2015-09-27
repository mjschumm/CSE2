// Mark Schumm Lab 5 9/24/15
//Using a scanner class to have the user input 2 integers and a mathematical operator.
//The switch function will be used to develop 4 cases +-/* and a 5th case if its an illegal operator.
//Finally it will compute and display the value of the 2 integers and mathematical operator

//The while loop is in place to allow the user to continuously run the code, inputing 
//integers and operators until the user inputs an N or n which escapes the while loop.
import java.util.Scanner;

public class CalculatorSpecial {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        
        
        boolean b=true;
        
    while (b==true) {
        
        System.out.print("Type n or N to stop.  Type y to continue: ");
        String response= myScanner.next();
       //I have the first switch statement to set up 3 cases.  If the string
       //is N or n, the b variable is declared false which stops the while loop.
       //If the string statement is y then the case runs through lab04 statements
       switch (response) {
           case "n": b=false;
           break;
           case "N": b=false;
           break;
           default:
       
             double value;
        
        System.out.print("Enter an integer: ");
        double integerA = myScanner.nextDouble();
        
        System.out.print("Enter a second integer: ");
        double integerB = myScanner.nextDouble();
        
        System.out.print("Enter a mathematical operator: ");
        String mathOperator= myScanner.next();
        
        

        switch (mathOperator) {
            case "+": value= integerA + integerB;
                    System.out.println("The value is " + value);

            break;
            case "-": value= integerA - integerB;
                    System.out.println("The value is " + value);

            break;
            case "*": value= integerA * integerB;
                    System.out.println("The value is " + value);

            break;
            case "/": value= integerA / integerB;
                    System.out.println("The value is " + value);

            break;
            default: System.out.println("Illegal Operator");
            break;
        }
             
        break;
        
        
        }
    }
    }
}
