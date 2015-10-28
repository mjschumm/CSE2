//Mark Schumm 10/15/15
//This java code will calculate the mean and median of 10 integers 
//inputed by the user.
//The numbers are inputed from smallest to largest by the user
//The mean and median will be calculated under separate methods
//and a void print statment will be used to print the results

import java.util.Scanner;

public class Methods {
    //Public static double is the method that is used to calculate the average. 
    //The method calls the 10 defined user variables and in the method
    //the sum is calculated followed by dividing by 10 to achieve the average.
    public static double average(double a,double b,double c,double d,double e,double f,double g,double h,double i,double j) {
        double avg;
        double sum;
        
        sum=a+b+c+d+e+f+g+h+i+j;
        avg=sum/10;
        return avg;
    }
    //Public static double is used again to calculate median. As with the average
    //method, the 10 user defined numbers are called and the median is calculated
    //as the average of the (n/2) and (n/2)+1 numbers since n=10 and is even
    //this value is returned to the void statement 
     public static double median(double a,double b,double c,double d,double e,double f,double g,double h,double i,double j) {
         double med;
         med=(e+f)/2;
         return med;
     }
    
    
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter the numbers from smallest to largest");
        System.out.print("Enter number 1: ");
        double num_1 = myScanner.nextDouble();
        System.out.print("Enter number 2: ");
        double num_2 = myScanner.nextDouble();
        System.out.print("Enter number 3: ");
        double num_3 = myScanner.nextDouble();
        System.out.print("Enter number 4: ");
        double num_4 = myScanner.nextDouble();
        System.out.print("Enter number 5: ");
        double num_5 = myScanner.nextDouble();
        System.out.print("Enter number 6: ");
        double num_6 = myScanner.nextDouble();
        System.out.print("Enter number 7: ");
        double num_7 = myScanner.nextDouble();
        System.out.print("Enter number 8: ");
        double num_8 = myScanner.nextDouble();
        System.out.print("Enter number 9: ");
        double num_9 = myScanner.nextDouble();
        System.out.print("Enter number 10: ");
        double num_10 = myScanner.nextDouble();
        
        System.out.println("The average is: "+ average(num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9, num_10));
        
        System.out.println("The median is: "+ median(num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9, num_10));

    }
}

