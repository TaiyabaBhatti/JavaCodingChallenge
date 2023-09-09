package com.UserDefinedClasses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class PizzaFunction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of pizza to have in PizzaShop..");
//        int NoOfPizza=sc.nextInt();
//        for (int i=0;i<NoOfPizza;i++){
//            System.out.println("Enter Pizza Flavour (Medium only):");
//            String pizzaFlavour=sc.next();
//            System.out.println("Enter Pizza Price:");
//            short pizzaPrice=sc.nextShort();
//            pizzaList.add(new Pizzaa(pizzaFlavour,pizzaPrice));
//        }
        System.out.println("There are four pizzas in program!!!");
        Pizzaa p1=new Pizzaa("Fajita", (short) 780);
        Pizzaa p2=new Pizzaa("Arabic", (short) 830);
        Pizzaa p3=new Pizzaa("Tandoori", (short) 560);
        Pizzaa p4=new Pizzaa("Cheezzey", (short) 350);

        ArrayList<Pizzaa> pizzaList1=new ArrayList<>();
        pizzaList1.add(p1);
        pizzaList1.add(p2);
        ArrayList<Pizzaa> pizzaList2=new ArrayList<>();
        pizzaList2.add(p3);
        pizzaList2.add(p4);

        Pizza_Shop s1=new Pizza_Shop("Pizza Hut",9232865,pizzaList1);
        Pizza_Shop s2=new Pizza_Shop("Domino's",926754,pizzaList2);

        Pizza_Order o1=new Pizza_Order(s1);
        Pizza_Order o2=new Pizza_Order(s2);

        System.out.println("Two pizzas are offered by Pizza Hut");
        o1.displayFlavours();
        System.out.println("Two pizzas are offered by Domino's");
        o2.displayFlavours();

        o2.makeOrder("cheezzey","tandoori");
        o2.calculateTotalAmount();
        o2.printOrder();

    }
}
class Pizzaa{

    private String flavour;
    private short price;
    Pizzaa(String flavour,short price){
        this.flavour=flavour;
        this.price=price;
    }
    public String getFlavour() {
        return flavour;
    }
    public short getPrice() {
        return price;
    }

    public String toString(){
        return " Pizza Flavour: "+this.flavour+" Price: "+this.price;
    }


}
class Pizza_Shop{
 private String shopName;
 private int phoneNo;
 private ArrayList<Pizzaa> pizzaList=new ArrayList<>();

 Pizza_Shop(String shopName, int phoneNo,ArrayList<Pizzaa> pizzaList){
     this.shopName=shopName;
     this.phoneNo=phoneNo;
     this.pizzaList=pizzaList;
 }
 public void displayFlavoursWithPrice(){
     for (Pizzaa obj:pizzaList) {
         System.out.println(obj.getFlavour()+"  "+obj.getPrice());
     }
 }
 public short calculateAmount(String[] pizzas){
     short price=0;
     for (Pizzaa obj:pizzaList) {
         for (int i=0;i< pizzas.length;i++){
             if (obj.getFlavour().equalsIgnoreCase(pizzas[i])){
                 price += obj.getPrice();
             }
         }
     }
     return price;

 }



}
class Pizza_Order{
   private Pizza_Shop orderFrom;
    private String[] pizzaSelected;
    private short totalAmount;
    private LocalTime time;
    Pizza_Order(Pizza_Shop orderFrom){
        this.orderFrom=orderFrom;
    }
    public void displayFlavours(){
        orderFrom.displayFlavoursWithPrice();
    }

    public void makeOrder(String ...pizzaFlavors){
        pizzaSelected=new String[pizzaFlavors.length];
        for (int i = 0; i < pizzaFlavors.length; i++) {

            pizzaSelected[i]=pizzaFlavors[i];
        }
    }

    public void calculateTotalAmount(){
        short price=orderFrom.calculateAmount(pizzaSelected);
        totalAmount=price;
    }

    public void printOrder(){
        time=LocalTime.of(1,15);
        for (String pizzas:pizzaSelected) {
            System.out.println(pizzas);
        }
        System.out.println("Total Amount to be Paid : "+totalAmount);
        System.out.println("Delivery Time "+time);

    }

}