package com.UserDefinedClasses;

public class BurgerFunction {

    public static void main(String[] args) {

        Burger refVar;
        refVar=new BeefBurger("Beef",false,750,true);
        refVar.makeBurger();
       refVar=new ZingerBurger("Chicken",true,700,true);
        refVar.makeBurger();

    }
}

abstract class Burger{
    private String meatType;
    private boolean cheese;
    private int price;
    Burger(String meatType,boolean cheese,int price){
        this.cheese=cheese;
        this.meatType=meatType;
        this.price=price;
    }
    abstract public void makeBurger();

    public boolean isCheese() {
        return cheese;
    }

    public int getPrice() {
        return price;
    }

    public String getMeatType() {
        return meatType;
    }
}

class ZingerBurger extends Burger{

    private boolean fries;
    ZingerBurger(String meatType, boolean cheese,int price,boolean fries){
        super(meatType,cheese,price);
        this.fries=fries;
    }

    @Override
    public void makeBurger() {

        System.out.println("Burger is making!!!!!!!");
        System.out.println("Burger: "+super.getMeatType());
        System.out.println("Price: "+super.getPrice());
        System.out.println("Cheesy? "+super.isCheese());
        System.out.println("Fries? "+fries);


    }
}
class BeefBurger extends Burger{

    private boolean pickles;
    BeefBurger(String meatType, boolean cheese,int price,boolean pickles){
       super(meatType,cheese,price);
        this.pickles=pickles;
    }

    @Override
    public void makeBurger() {

        System.out.println("Burger is making!!!!!!!");
        System.out.println("Burger: "+super.getMeatType());
        System.out.println("Price: "+super.getPrice());
        System.out.println("Cheesy? "+super.getMeatType());
        System.out.println("Pickles? "+pickles);

    }


}

