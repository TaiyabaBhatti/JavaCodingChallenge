import java.lang.StringBuilder;

public class PalindromeOrNot {
    public static void main(String[] args) {


        String str1="aecba";

        System.out.println("Given String is Palindrome or not ? "+palindrome(str1));




    }
    public static boolean palindrome(String str2){

        boolean status;
        for (int i=0 ; i<str2.length()/2 ; i++) {

            char start = str2.charAt(i);
            char end = str2.charAt(str2.length() - i-1);
            if (start != end) {
                return false;
            }

        }
        return true;







    }


}
