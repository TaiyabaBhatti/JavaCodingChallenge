public class Exercise1 {
    public static void main(String[] args) {
        // Write a Java program to create a class called "Person" with a name and age attribute.
        // Create two instances of the "Person" class,
        // set their attributes using the constructor, and print their name and age.

        Person p1= new Person((byte) 19,"Tayyaba");
        Person p2= new Person((byte) 20,"Mirha");
      p1.display();
      p2.display();


    }

}
class Person{
    String name;
    byte age;
Person(byte age,String name){
    this.age=age;
    this.name=name;
}

void display(){
    System.out.println("Name of the person "+name);
    System.out.println("Age of that person "+age);
}



}
