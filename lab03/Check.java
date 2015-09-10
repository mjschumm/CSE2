//Mark Schumm Lab 3 9/10/15
//Using a scanner class to allow the program to calculate the amount 
//owed by each person for a meal based on the users input
//The user inputs the total cost, tip and the number of people splitting the bill

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
       //3 scanners are used.  For cost of check, tip, and number of people 
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        tipPercent /=100;
       //the tip is divided by 100 to convert it to a decimal 
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies;
        
        totalCost=checkCost*(1+tipPercent);
        costPerPerson=totalCost/numPeople;
        
        dollars=(int)costPerPerson;
        dimes=(int)(costPerPerson*10) % 10;
        pennies=(int)(costPerPerson*100) % 10;
        //to print out a cost to 2 decimal places the dollars variable is created as an int of the total cost
        //the % (mod) operator returns the remainder of the calculaiton.
        // For dimes the cost is multiplied by 10 and the remainder after it is divided by 10 is computed.
        //For example, if the total cost per person is 78.68=> (int)*10= 786 the remainder after it is 
        //divided by 10 is 60.  60 cents is the total cost for the tenth decimal place
        //for pennies 78.68=>(int)*100=7868.  The remainder after it is divided by 10 is 8. 
        //This represents the 100 decimal place
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);

        
}
}