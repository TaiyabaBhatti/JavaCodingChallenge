import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {



        String str1="Lous";
        String str2="lous";

        System.out.println(str1==str2);
        System.out.println(str1.equalsIgnoreCase(str2));


        str2="Lous"; // no new object create, but it points to the str1 object and the previous value of str2 will collect
        // by garbage collector

        System.out.println(str1.compareTo(str2)); // checks Ascii value of every character one by one

        String str3="Hackaton";
        String str4="Hackaton";

        str3= str3.replace('k','t');
        System.out.println(str3==str4);



        System.out.println(str3==str4);
        str4=str4.toUpperCase();
        System.out.println(str3==str4);

        System.out.println(str4.charAt(3));
        System.out.println(str4.contains("TON"));
        System.out.println(str3.indexOf('a'));
        System.out.println(str3.isEmpty());
        System.out.println(Arrays.toString(str3.toCharArray()));
        System.out.println(str3.replace('k','a'));

        String name="Hello, Nice to meet you";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(Arrays.toString(name.split("o")));


    }
}
