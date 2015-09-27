//Mark Schumm
//User ID: 869819462
//This program will use a while statement to continuously 
//request a grade to be entered.
//A grade less than 0 or greater than 100 will be 
//ivalid and the user will be informed
//Having a grade of 999 inputed by the user, the program
//will exit the loop and compute and display the 
//average of the grades valid entered.

//The variables average, sum, and counter are defined and
//initialized before the while loop in order to have
//proper scope of variable
import java.util.Scanner;

public class averageGrade {
    public static void main(String[] args){
        Scanner myScanner= new Scanner (System.in);
        
        boolean b=true;
        
        double average=0;
        double sum=0;
        double counter=0;
        
        while (b==true) {
            System.out.print("Enter a grade: ");
            double grade= myScanner.nextDouble();
            
            if (grade>=0&&grade<=100) {
                sum=sum+ grade;
                counter++;
            }
            else if (grade==999){
               average=sum/counter;
                System.out.println("The average grade is : "+average);
                b=false; 
            }
           
            else {
            System.out.println("The entered grade is invalid.");

                }
            }
        }
    }