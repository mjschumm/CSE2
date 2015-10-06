public class HarmonicSum {
    public static void main(String[] args) {
        double n=50000;
        double sum =0;
        double sum_Left=0;
        for (double i=1; i<=n;i++) {
            sum=sum+(1/i);
        }
        for(double j=n; j>=1;j--) {
            sum_Left=sum_Left+(1/j);
        }
        System.out.println("The Harmonic Sum of n from right to left is: "+ sum);
        System.out.println("The Harmonic Sum of n from left to right is: "+ sum_Left);
    }
}