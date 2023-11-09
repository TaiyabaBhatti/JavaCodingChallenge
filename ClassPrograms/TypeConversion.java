public class TypeConversion {
    public static void main(String[] args) {



        int numberint =5;
        System.out.println(numberint);

        //type widening no error
        float numberfloat;
        numberfloat = numberint;
        System.out.println(numberfloat);

        float number2float=34.78f;
        int number2int=(int)number2float;    //type casting
        System.out.println(number2int);

        char letter='a';
        System.out.println(letter);
//       int letter_ASCII_value=(int) letter;
//        System.out.println(letter_ASCII_value);
        // it is redundant to cast char to int

        int letter_ASCII_value_m2;
        letter_ASCII_value_m2 = letter;
        System.out.println(letter_ASCII_value_m2);


        char letter_ASCII_value=97;
        System.out.println(letter_ASCII_value);








    }
}
