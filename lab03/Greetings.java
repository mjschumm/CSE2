import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number % 10==0)
        System.out.println("Hello");
        else if (number%9==0)
        System.out.println("World");
        else
        System.out.println("Bye");
        
      boolean b = (true || false);
      System.out.println("answer "+b);
      }
    }
