package com.finalExam;

public class Inheritance1 {


    public static void main(String[] args) {

        A a=new A();
        B b=new B();
        C c=new C();

        A ref;

        ref=new C();
        ref.display();
        ref.haveSome();

    }
}



class A{

    public void display(){
        System.out.println("I'm C House");

    }
    public void haveSome(){
        System.out.println("class C");
    }

}


class B extends A{
}
class C extends A{

    public void display(){
        System.out.println("I'm C House");
    }



}