import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {


        Scanner object=new Scanner(System.in);

        int number1= object.nextInt();
        int number2= object.nextInt();


        System.out.println("Number 1= "+number1);
        System.out.println("Number 2= "+number2);

        // using XOR operator to get the different values not of number1 and number2
          int var=number1^number2;

          // using XOR operator and operation is being performed on var and number1
        // by this operation the bits we get of number2 as it excludes all bits of number2

          number1=var^number1;
          number2=var^number2;

        System.out.println("Number 1= "+number1);
        System.out.println("Number 2= "+number2);








    }
}
