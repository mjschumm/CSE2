    import java.util.Scanner;
public class move_array {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the number of integers to be stored in the array: ");
        int n = myScanner.nextInt();
        int[] Array = new int[n];
        for(int i=0;i<n;i++){
            Array[i]=(int)(Math.random()*100);
            //The first for loop computes the values in the array based on random integers from 0 and 100
        }
        System.out.print("Enter the value of the index: ");
        int index = myScanner.nextInt();


