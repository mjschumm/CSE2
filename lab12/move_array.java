//Mark Schumm
//Lab 12
//Move items in array
import java.util.Scanner;
public class move_array {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the number of integers to be stored in the array: ");
        int n = myScanner.nextInt();
        if(n<0) {
            System.out.println("System error, value needs to be greater than zero");
        }
        
        int[] Array = new int[n];
        //creates an array of size inputed by user
        for(int i=0;i<n;i++){
            Array[i]=(int)(Math.random()*100);
            //The for loop computes the values in the array based on random integers from 0 and 100
        }
         System.out.println("Array: ");
        for(int w=0;w<Array.length;w++) {
        System.out.println(Array[w]);
        }
        System.out.println(" ");
  
        System.out.print("Enter the value of the index: ");
        int index = myScanner.nextInt();
        if(index<0 || index>n-1) {
            System.out.println("System error, index out of bounds.");
        }
        int temp=Array[index];
        for(int j=index+1; j<n; j++) {
            Array[j-1]=Array[j];
            //saving the indexed value as a temporary value
        }
        Array[n-1]=temp;
        //adding the temporary value to the end of the array
         System.out.println("Array after indexing: ");
        for(int v=0;v<Array.length;v++) {
        System.out.println(Array[v]);
        }
  
    }
}
        


