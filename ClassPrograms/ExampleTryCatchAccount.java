import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class ExampleTryCatchAccount {
    public static void main(String[] args) throws InvalidAmountException,InsuficientBalanceException{
Scanner sc=new Scanner(System.in);
        Account a1=new Account("Tayyaba",50000);

        while (true) {
            System.out.println("Enter amount to withDraw:");
            long amount=sc.nextLong();
            try {
                a1.withdraw_amount(amount);
            }
            catch (Exception obj){
                System.out.println("Exception: "+obj.toString());
            }
            System.out.println(a1.getBalance_amount());
            System.out.println(a1.getWithdrawamount());
            System.out.println("Want to try ?(y/n)");
            String op=sc.next();
            if (op.charAt(0)=='n'){
                break;
            }



        }

    }
}


class Account{
    private String cus_name;
    private long balance_amount;
    private long withdrawamount;
Account(String cus_name,long balance_amount){
    this.cus_name = cus_name;
    this.balance_amount=balance_amount;
}
public void withdraw_amount(long withdrawamount) throws InsuficientBalanceException,InvalidAmountException {


    if (withdrawamount <= 0) {

        throw new InvalidAmountException("Amount input is not valid");

    } else if (withdrawamount > balance_amount) {
        throw new InsuficientBalanceException("Amount exceeds to your balance");
    } else {
        this.withdrawamount = withdrawamount;
        balance_amount -= withdrawamount;
    }

}

    public long getBalance_amount() {
        return balance_amount;
    }

    public long getWithdrawamount() {
        return withdrawamount;
    }
}
class InsuficientBalanceException extends Exception{
    InsuficientBalanceException(String message){
        super(message);
    }

}
class InvalidAmountException extends Exception{
    InvalidAmountException(String message){
        super(message);
    }

}