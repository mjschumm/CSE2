public class forTest {
    public static void main(String[] args) {
        for(int i = 1; i<=10 ;i=i+2) {
            for(int j=0; j<10;j++){
                
            System.out.println(i+" "+j);
            if(i%3==0)
            break;
        }
        }
        for(char x = 'a'; x<'z'; x++) {
            System.out.print(x);
        }
    }
}