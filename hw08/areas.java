//Mark Schumm
//Hw 08
import java.util.Scanner;
//The scanner is used since the program need to keep asking the user for a valid
//shape, if an invalid one is entered
public class areas {
   
    public static double area(double r) {
        //The first area method inputs a radius that will be defined by the user.
        //The area method then computes the area of the circle using the
        //equation area=pi*r*r
        //It then returns the circle area value
        double area_circle;
        double rounded_area_circle;
        area_circle=Math.PI*r*r;
        rounded_area_circle=Math.round(area_circle*100.0)/100.0;
        return rounded_area_circle;
    }
    public static double area(double a, double b) {
        //The second area method inputs two variables, length and width,
        //That will be defined by the user.  It computes the area
        //using the equation area=length*width
        //It the returns the rectangle area value
        double area_rectangle;
        area_rectangle=a*b;
        return area_rectangle;
    }
    public static double area(double c, double d, double e) {
        //The third area method inputs three variables, height base 1 and base 2
        //That will be defined by the user.  It computes the area of the trapezoid
        //by the equation area=(height/2)*(base 1+ base 2)
        //It returns the trapezoid area value
        double area_trapezoid;
        double rounded_area_trapezoid;
        area_trapezoid=(c/2)*(d+e);
        rounded_area_trapezoid=Math.round(area_trapezoid*100.0)/100.0;
        return rounded_area_trapezoid;
    }
    public static void main(String[] args) {
       //The main method defines the scanner class
        Scanner myScanner = new Scanner (System.in);
        
        for(int j=1; j<3;j++){
            //a for loop is used to keep asking the user if an invalid shape is asked
        System.out.print("Enter done, if you would like to exit the execution\nEnter Shape (circle, rectangle, trapezoid): ");
        String shapeOut= myScanner.next();
        //It uses the string class to take the users shape input
        //The switch statment is used to easily compute the different cases that result
        
        
        
        switch (shapeOut) {
            case "circle": System.out.print("Enter value of radius: ");
            double radius = myScanner.nextDouble(); 
                    System.out.println("The area of the circle is " + area(radius));
                    j=3;
                //The first case is circle and it asks the user to define a radius which it then uses 
                //as the input to the area() method.  It knows to use the area of the circle method
                //because it is given a single input
                //It then prints out the value for the area of the circle
            break;
            
            case "rectangle": System.out.print("Enter the value of the length: ");
        double length = myScanner.nextDouble();
           System.out.print("Enter the value of the width: ");
        double width = myScanner.nextDouble();
                    System.out.println("The area of the rectangle is " + area(length,width));
                    j=3;
                //The second case is of a rectangle and it asks the user to define a length and a width
                //It then uses this as the inputs to the area() method.  It knows to use the area
                //of the rectangle method because it has two inputs
                //It then prints out the value of the area

            break;
            
            
            case "trapezoid": System.out.print("Enter the value of the height: ");
        double height = myScanner.nextDouble();
           System.out.print("Enter the value of base 1: ");
        double base1 = myScanner.nextDouble();
           System.out.print("Enter the value of base 2: ");
        double base2 = myScanner.nextDouble();
                    System.out.println("The area of the trapezoid is " + area(height, base1, base2));
                    j=3;
                    break;
            //The third case is of a trapezoid and it asks the user to define a height base 1 and base 2
            //It then uses this as the inputs to the area() method and prints out the value of the area
            case "done": j=3;
                    break;
            //The done case is used to break out of the for loop.  In case the user wishes to stop the 
            //execution of the program.
           
            default: System.out.println("Invalid shape");
            j=j-1;
            break;
            //The default case is used for any sort of invalid shape input the user may enter
            //It then causes the program to loop and the program repeats the code.
        }
    }
}
}
        