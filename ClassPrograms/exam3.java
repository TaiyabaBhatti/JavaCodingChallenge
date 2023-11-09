import java.util.Arrays;

public class exam3 {
    public static void main(String[] args) {

//             String str="abcdefghi abcdefghi alphabates";
//             String str2=str.substring(0,9);
//             String str3=str.substring(20,30);
//        System.out.println(str.toUpperCase());
//        System.out.println(str.substring(0,9));//upto 8
//        System.out.println(str.contains(str3));
//        System.out.println(str.indexOf('e'));      //first occurence
//        System.out.println(str.indexOf('e',5));      //from where
//        System.out.println(str.lastIndexOf('e',6));
//        System.out.println(str.indexOf(str3));
//        System.out.println(str3.replace('a','z'));
//        System.out.println(str.trim());
//        System.out.println(Arrays.toString(str.split("e",10)));
//        System.out.println(str3.startsWith("alp"));
//
         StringBuilder builder=new StringBuilder("Aphabate");
        System.out.println(builder);
        System.out.println(builder.insert(1,'l'));

        System.out.println(builder.length());
        System.out.println(builder.capacity());
        builder.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(builder.length());
        System.out.println(builder.capacity());
        System.out.println(builder);
         builder.setLength(10);
        System.out.println(builder);
       StringBuilder build=new StringBuilder("Alphabate");
        build.setCharAt(0,'E');
       System.out.println(build);
        build.reverse();
        System.out.println(build);
        System.out.println( build.replace(0,build.length(),"Hello"));











    }
}
