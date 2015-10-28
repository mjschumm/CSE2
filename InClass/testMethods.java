//Adding methods outside of main method, using multiplle
//void statements
public class testMethods {
    public static void hw() {
        System.out.println("Hello World!");
    }
    public static int add(int a, int b) {
        //System.out.println("add= "+ (a+b));
        int c;
        c=a+b;
        return c;
    }
    public static boolean isMult2(int a) {
        if(a%2==0) {
            return true;
        }    
        else {
            return false;
        }
    }
    public static String Hello(String s) {
        return "Hello "+s;
    }
    public static void main(String[] args) {
        hw();
        System.out.println("add="+ add(3,8));
        
        System.out.println(Hello("World"));
        //System.out.println(isMult2(5));
        if(!isMult2(5)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    
}
