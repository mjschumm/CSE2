import java.util.Scanner;

public class addInterests {
    public static void main(String[] args) { 
        Scanner myScanner= new Scanner (System.in);
        
        System.out.print("Enter Starting Balance: ");
        double startBalance= myScanner.nextDouble();
        System.out.print("Enter the interest rate: ");
        double intRatePerc= myScanner.nextDouble();
        System.out.print("Enter the number of years: ");
        double numYears= myScanner.nextDouble();
        double intRate=intRatePerc/100;
        double balance=startBalance;
        double amtInterest=0;
        double i=1;
        while (i<=numYears) {
            balance=balance+intRate*balance;
            i++;
            
        }
        amtInterest=balance-startBalance;
        System.out.println("The total amount of interest is: " + amtInterest);
        
        
        int j = 0;
        for (int m=0; m<10; m++) {
         if (m % 2 == 0) {
          break;
          System.out.println(j);
             }
             j++;
            }
        
    }
    
}