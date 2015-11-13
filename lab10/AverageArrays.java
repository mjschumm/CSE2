//October 29
//Mark Schumm
//Lab 10
    import java.util.Scanner;
//The user will import the number of integers to be stored in the array
public class AverageArrays {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the number of integers to be stored in the array: ");
        int n = myScanner.nextInt();
        int[] Array = new int[n];
        //The Array is initialized based on the user defined 'n' variable
        double sum=0;
        double average;
        
        for(int i=0;i<n;i++){
            Array[i]=(int)(Math.random()*100);
            //The first for loop computes the values in the array based on random integers from 0 and 100
        }
        for(int j=0; j<n;j++) {
            System.out.println("Array["+j+"]= "+Array[j]);
            //The second for loop prints out the values of the Array
        }
        for(int k=0; k<n;k++) {
            sum=sum+Array[k];
            //The third for loop prints out the total sum of all the Array values
        }
        average=sum/n;
//The average is calculated based on the sum variable divided by the 'n' variable
        System.out.println("The sum of the values in the array is "+sum+"\nThe average of the values in the array is "+average);
        for(int l=0; l<n;l++) {
            if (Array[l]>=average) {
                System.out.println("Array["+l+"]= " + Array[l]);
                //The final for loop prints out the values in Array that are greater than or equal to the average
            }
            else {
                
            }
        }
       
    }
    
   
}