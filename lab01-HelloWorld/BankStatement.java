public class BankStatement {
    public static void main(String[] args) {
        double accountBalance;
        double interestRate;
        double balance;
        accountBalance=2001;
        interestRate=0.31;
        balance= accountBalance + (interestRate*accountBalance);
        System.out.println("The balance of the account is $"+ new Float( Math.round(balance)));
        
        int p = 3, q = 1, sum = 0;
while (p <= 10)
{
     sum += p % q;
     p++;
     q++;
}
    System.out.println(sum);

int x = 0, y = 0;
        while (x < 3)
        {
            switch (x + y)
            {
                case 0:
                    x++;
                case 1:
                case 2:
                    y++;
                    break;
                case 3:
                    x++;
                    break;
                default:
                    y = 0;
                    break;
            }
            System.out.print(y);
        }
    }
}