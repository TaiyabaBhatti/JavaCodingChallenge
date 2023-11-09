public class Exercise12 {
    public static void main(String[] args) {

        //Write a Java program to find duplicate values in an array of integer values.

          int[] array={5,7,3,3,5,8};
          for (int i=0;i< array.length-1;i++){
              for (int j=i+1;j< array.length;j++){

                  if (array[i]==array[j]){    //(array[i]==array[j] && i!=j)

                      System.out.println(array[i]);

                  }

              }
          }










    }
}
