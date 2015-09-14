import java.util.Scanner;
public class Block {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the length of the block: ");
        double length = myScanner.nextDouble();
        
        System.out.print("Enter the width of the block: ");
        double width = myScanner.nextDouble();
        
        System.out.print("Enter the height of the block: ");
        double height = myScanner.nextDouble();
        
        double volume, surfaceArea;
        
        volume= length*width*height;
        surfaceArea = 2*(length*width+length*height+width*height);
        
        System.out.println("The volume of the block of dimensions "
        +length+ " x " +width+ " x " +height+ " is " +volume+ ".");
        System.out.println("The surface area of the block is " +surfaceArea+".");
    }
}