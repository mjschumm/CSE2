public class BankStatement {
    public static void main(String[] args) {
        double accountBalance;
        double interestRate;
        double balance;
        accountBalance=2001;
        interestRate=0.31;
        balance= accountBalance + (interestRate*accountBalance);
        System.out.println("The balance of the account is $"+ new Float( Math.round(balance)));
        
    }
}