// Mark Schumm Lab 4 9/17/15
//Using a scanner class to have the user input 2 integers and a mathematical operator.
//The switch function will be used to develop 4 cases +-/* and a 5th case if its an illegal operator.
//Finally it will compute and display the value of the 2 integers and mathematical operator
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        double integerA = myScanner.nextDouble();
        
        System.out.print("Enter a second integer: ");
        double integerB = myScanner.nextDouble();
        
        System.out.print("Enter a mathematical operator: ");
        String mathOperator= myScanner.next();
        
        double value;

        
        
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
        }
    }
