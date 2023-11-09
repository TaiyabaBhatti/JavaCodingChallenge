package com.finalExam;
public class Q1_b {
    public static void main(String[] args) {
        Mammal mammal=new Mammal("Bat",true, (byte) 2);
        mammal.ShowInfo();

    }
}

class Animal{
    protected String name;
    private boolean gender;
    private byte legs;

    Animal(String name,boolean gender,byte legs){
        this.name=name;
        this.gender=gender;
        this.legs=legs;
    }
    public void ShowInfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Legs: "+legs);
    }
}
class Vertebrate extends Animal{

    private final boolean vaetebralColumn=true;

    Vertebrate(String name,boolean gender,byte legs){
        super(name,gender,legs);

    }

    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Vertebral Columun: "+vaetebralColumn);
    }




}
class Mammal extends Vertebrate{

    Mammal(String name,boolean gender,byte legs){
        super(name,gender,legs);

    }
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println(name+" nursing it young.");
    }






}
class Invertebrate extends Animal{
    private final boolean vaetebralColumn=false;
    Invertebrate(String name,boolean gender,byte legs){
        super(name,gender,legs);

    }

    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("Vertebral Columun: "+vaetebralColumn);
    }









}
class Worms extends Animal{
    Worms(String name,boolean gender,byte legs){
        super(name,gender,legs);
    }
    public void ShowInfo(){
        super.ShowInfo();
        System.out.println("I'm fludy");
    }
}
