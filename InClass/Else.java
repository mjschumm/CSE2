public class Else{
    public static void main(String[] args){
        int width, length, area;
        width=7;
        length=10;
        if (width>5 && length>5) {
            area=width*length;
            System.out.println("Area = "+area);
        }
        else {
            System.out.println("Area=0");
        }
    }
}