 //Mark Schumm
 //CSE2 HW 10
 //email: mjs317
 //ID: 869819462
 //Mine Sweeper
    import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
     Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the size of the board, between 2 and 30: ");
        int N = myScanner.nextInt();
        //Scanner asks the user to import the size of the board.
        //This value is used to initialize the 2-D array.
        //With its length and width a nxn
        String[] [] Array = new String[N][N];   
        System.out.print("Enter the number of mines to be placed on the array, between 1 and "+ N*N+":");
        //This asks the user to input the number of mines.
        //The only limitation is that it's between 1 and n*n

        int m = myScanner.nextInt();
       String str="M";
       //M is defined as a String variable and 
       //THis will be the mine
       String blank="_";
       //The non mines are defined by an underscore
       int xCord;
       int yCord;
        for (int i=1; i<=m; i++){ 
            xCord=(int)(Math.random()*N);
            yCord=(int)(Math.random()*N);
            Array[xCord][yCord]=str;
            //This creates the random coordinates, x and y
            // From where the mines will be placed
            //The for loop is run from 1 to the number of 
            //Mines specified by the user

        }
        for(int j=0; j<N; j++) {
            for(int k=0; k<N; k++) {
                if(Array[j][k]!=str) {
                 Array[j][k]=blank;   
                }
                else {
                }

            }

        }
        String one="1";
        System.out.println();
        
        

        for(int l=0; l<N; l++) {
            for(int n=0;n<N;n++ ) {
                if(Array[l][n]==str){
                    if (l<N-1) {
                Array[l+1][n]=one;
                }
                else {
       //For the for loop I was only able to do the 
       //scenario in which the one is added to the block 
       //below the location of the bomb
                }
                   
                }
            else {
                
            }
            System.out.print("|"+Array[l][n]);

            }
            System.out.println();
        }
         
        }
    }
