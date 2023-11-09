import java.util.Arrays;

public class Iterate {
    public static void main(String[] args) {


        String str="";
        for (int i=0;i<26;i++){

            char ch=(char)('a'+i);
            str += ch;
        }
        System.out.println(str.toCharArray());






        // the garbage collector runs and reclaims memory is determined by the Java Virtual Machine's garbage
        // collection strategy.This process might not happen immediately after the reference changes, and there
        // could be a delay before the memory is actually reclaimed.
//Using StringBuilder as suggested earlier helps mitigate this issue because it allows you to build a string without
// creating a new object in each iteration. This can reduce the amount of garbage generated
// and potentially improve memory performance in situations where string concatenation is done within loops.

    }
}
