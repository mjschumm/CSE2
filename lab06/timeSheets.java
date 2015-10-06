//Mark Schumm
//Lab06 10/1/15
import java.util.Scanner;

public class timeSheets {
    public static void main(String[] args){
        Scanner myScanner= new Scanner (System.in);
     
            System.out.print("Number of employee time sheets: ");
            double numTimeSheet= myScanner.nextDouble();
            double totalHours=0;
            double payRoll=0;
            double totalPayRoll=0;
        for (int i=1; i<=numTimeSheet;i++) {
           System.out.print("Pay of employee per hour in cents: ");
            double wageCents= myScanner.nextDouble();  
            for (int j=1;j<=5;j++) {
             System.out.print("The number of hours worked for day "+j+": ");
            double hoursWorked= myScanner.nextDouble();  
            totalHours=hoursWorked+totalHours;
            }
            payRoll=wageCents*totalHours;
            totalPayRoll=payRoll+totalPayRoll;
        }
        System.out.println("The total pay for the "+numTimeSheet+" employees is: "+totalPayRoll+" cents");
    }
}