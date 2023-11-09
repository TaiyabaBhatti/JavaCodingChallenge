import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        Scanner obj=new Scanner(System.in);

        String ch;

        do {
            int fact = 1;
            System.out.println("Enter any number");
            int number = obj.nextByte();
            int num = number;
            while (num>0){

                fact *= num;
                num--;
            }
            System.out.println("Factoril of "+number+" = "+fact);
            System.out.println("Do you want to calculate again?(y/n):");
             ch = obj.next();
        }

        while (ch.equals("y"));







    }
}
