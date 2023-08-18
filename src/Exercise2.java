public class Exercise2 {
    public static void main(String[] args) {

        //Write a Java program to create a class called "Dog" with a name and breed attribute.
        // Create two instances of the "Dog" class, set their attributes using the constructor
        // and modify the attributes using the setter methods and print the updated values.
        Dog dog1=new Dog("Shepherd","German");
        Dog dog2=new Dog("Bulldog","French");
        dog1.setName("Poodle");
        dog2.setBreed("Itly");
        System.out.println(dog1.getName() + " is from " +dog1.getBreed() );
        System.out.println(dog2.getName() + " is from " +dog2.getBreed() );




    }

}

class Dog{
     private String name;
    private String breed;

    Dog(String name,String breed){
      this.name=name;
      this.breed=breed;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setBreed(String breed){
        this.breed=breed;
    }
    String getBreed(){
        return breed;
    }

}
