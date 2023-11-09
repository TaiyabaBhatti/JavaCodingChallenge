import java.util.Scanner;

public class Exam10 {
            public static void main(String[] args) {
                Account2 account = new Account2(1, "Hanzlla Soomro", 1000);
                try {
                    account.withdraw(2000);
                }catch(InvaliidAmountException exp) {
                    System.out.println(exp.getMessage());

                }catch(InsufficientBalanceException exp){
                    System.out.println(exp.getMessage());

                }

                System.out.println(account.getBalance());
            }


    }
class Account2 {

    private int id;
    private String title;
    private double balance;

    Account2(int id, String title, double balance) {
        this.id = id;
        this.title = title;
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException, InvaliidAmountException {

        if (amount <= 0)
            throw new InvaliidAmountException(amount + " is invalid. ");

        if (amount > balance)
            throw new InsufficientBalanceException("InsufficientBalance");

        balance -= amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class InsufficientBalanceException extends Exception{

    InsufficientBalanceException(String message){
        super(message);
    }


}
class InvaliidAmountException extends Exception{
    InvaliidAmountException(String message){
        super(message);
    }
}
