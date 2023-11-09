public class TwoComplement {
    public static void main(String[] args) {


        int num=100;
        int value2=~num;      //one's complement
        int value=~num+1;     //two's complement
        System.out.println(value);
    }
}
