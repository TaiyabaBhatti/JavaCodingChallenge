import java.util.ArrayList;

public class Exercise7 {
    public static void main(String[] args) {

        //Write a Java program to create a class called "Bank" with a collection of accounts and methods
        // to add and remove accounts, and to deposit and withdraw money.
        // Also define a class called "Account" to maintain account details of a particular customer.
        Account c1=new Account("Tayyaba",17500,"Current Account");
        Account c2=new Account("Areeba",5700,"Konnect Account");
        Account c3=new Account("Harib",1000,"Kisan Account");
        BankAlfalah.add_Account(c1);
        BankAlfalah.add_Account(c2);
        BankAlfalah.add_Account(c3);

        ArrayList<Account> account_Collection=BankAlfalah.getAccount_Collection();
        for (Account account:account_Collection) {

            System.out.println(account.getOwner_Name()+ " has " +account.getOwner_Balance() + " in "+account.getAccount_Name());


        }



    }
}
class Account{

    private String owner_Name;
    private double owner_Balance;
    private String account_Name;

    Account(String owner_Name,double owner_Balance,String account_Name){
        this.owner_Name=owner_Name;
        this.owner_Balance=owner_Balance;
        this.account_Name=account_Name;
    }

    public String getAccount_Name() {
        return account_Name;
    }

    public double getOwner_Balance() {
        return owner_Balance;
    }

    public String getOwner_Name() {
        return owner_Name;
    }

    public void deposit_Amount(double amount){
        owner_Balance += amount;
    }
    public void with_Draw(double amount){

        owner_Balance -= amount;
    }

    public void account_Information(){
        System.out.println("Account Name : "+ account_Name);
        System.out.println("Account Owner Name : "+ owner_Name);
        System.out.println("Account Balance : "+ owner_Balance);
        System.out.println();
    }
}

class BankAlfalah{

    private static ArrayList<Account> account_Collection=new ArrayList<>();

    public static void add_Account(Account account){
        account_Collection.add(account);
    }
    public static void remove_Account(Account account){
        account_Collection.remove(account);
    }

    public static ArrayList<Account> getAccount_Collection(){
        return account_Collection;
    }


}