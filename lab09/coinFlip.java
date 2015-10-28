// Mark Schumm
//Lab 09
//Coin flip
//Two methods along with main method
//flip() method creates a random number either zero or one and returns it.  
//Second flip method takes an integer n and runs the first method n times.
//Then it out puts the total number of heads and tail, based on the arbitrary 
//selection of heads equal to 1 and tail equal to 0.
//The user inputs an integer between zero and 100.  
//A value of 0 will run the first flip method
//A value between 1 and 100, will run the second method. 
import java.util.Scanner;

public class coinFlip {
    public static int flip() {
       int x= (int)(Math.random()*2);
       return x;
       
      
    }
    
    
    
    public static void flip(int n) {
        int countHeads=0;
        int countTails=0;
        for (int i=0;i<n;i++) {
            int y=flip();
            if(y==0){
                countHeads++;
            }
            else if (y==1){
                countTails++;
            }
        }
        System.out.println("The total number of heads is: "+countHeads+", The total number of tails is: "+countTails);
        
        
    }
    
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter an integer between 0 and 100: ");
        int num = myScanner.nextInt();
        if (num==0) {
            int z=flip();
             if (z==0){
           System.out.println("The flip is tails "+ z);

       }
       else if (z==1){
           System.out.println("The flip is heads "+ z); 
       }
        }
        else {
            flip(num);
        }
    }
}

        
        
        
        

        
        
        
        
    
    

    
    