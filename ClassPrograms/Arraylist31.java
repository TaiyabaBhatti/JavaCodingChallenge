import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i=0;i<4;i++){
            arrayList.add(i, sc.nextInt());
        }

        System.out.println(arrayList);

        arrayList.set(2,57);
        for (int element:arrayList) {
            System.out.print(element+" ");
        }

        System.out.println();
        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));

        arrayList.clear();
        System.out.println(arrayList);

        boolean status=arrayList.isEmpty();
        System.out.println(status);


    }
}
