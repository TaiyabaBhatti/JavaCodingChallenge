package com.UserDefinedClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Pizza> pizzaList=new ArrayList<>();
        System.out.println("Enter number of pizza to have in PizzaShop..");
        int NoOfPizza=sc.nextInt();
        for (int i=0;i<NoOfPizza;i++){
            System.out.println("Enter Pizza Flavour (Medium only):");
            String pizzaFlavour=sc.next();
            System.out.println("Enter Pizza Price:");
            int pizzaPrice=sc.nextInt();
            pizzaList.add(new Pizza(pizzaFlavour,pizzaPrice));
        }
         PizzaShop pizzaHut=new PizzaShop("PizzaHut",pizzaList);
         pizzaHut.displayPizza();
         PizzaOrder order=new PizzaOrder(pizzaHut);
         order.placeOrder();
        order.reviewOrder();
        order.payment();
    }
}
class Pizza{
    private String pizzaFlavour;
    private int pizzaPrice;
    Pizza(String pizzaFlavour,int pizzaPrice){
        this.pizzaFlavour=pizzaFlavour;
        this.pizzaPrice=pizzaPrice;
    }
    public int getPizzaPrice() {
        return pizzaPrice;
    }
    public String getPizzaFlavour() {
        return pizzaFlavour;
    }
}
class PizzaShop{
    private String pizzaShopName;
    private int totalPayment;
    private ArrayList<Pizza> pizzaList=new ArrayList<>();
    private ArrayList<Pizza> orderList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    PizzaShop(String pizzaShopName,ArrayList<Pizza> pizzaList){
        this.pizzaList=pizzaList;
        this.pizzaShopName=pizzaShopName;
    }
    public String getPizzaShopName() {
        return pizzaShopName;
    }
    public int getTotalPayment() {
        return totalPayment;
    }
    public void displayPizza(){
        System.out.println("* Customer is Viewing Menu Card...");
        System.out.println("<<<<<<<<<<<<\t"+this.pizzaShopName+" offers following pizza flavours(Medium only)\t>>>>>>>>>>");
        for (Pizza obj:pizzaList) {
            System.out.println(obj.getPizzaFlavour()+"\t"+obj.getPizzaPrice());
        }
    }
    public void selectPizza(){
        System.out.println("Customer is odering pizza!!!!");
        System.out.println("How many pizza to order");
        int pizzaOrder=sc.nextInt();
        for (int i=0;i<pizzaOrder;i++){
            System.out.println("Pizza Flavour:");
            String pizzaFlavour=sc.next();
            if (pizzaList.get(i).getPizzaFlavour().equalsIgnoreCase(pizzaFlavour)){
                orderList.add(pizzaList.get(i));
               totalPayment+=pizzaList.get(i).getPizzaPrice();
            }
        }
    }
    public void reviewOrder(){
        System.out.println("Order is being reviewing:");
        for (Pizza pizza:orderList) {
            System.out.println(pizza.getPizzaFlavour()+" "+pizza.getPizzaPrice());
        }
    }
}

class PizzaOrder{
    private PizzaShop pizzaHut;

    PizzaOrder(PizzaShop pizzaHut){
        this.pizzaHut=pizzaHut;
    }
    public void placeOrder(){
        System.out.println("Waiter is reday to take order!!!");
        pizzaHut.selectPizza();
    }

    public void reviewOrder(){
          pizzaHut.reviewOrder();
    }
    public void payment(){
        System.out.println(" Payment Card:");
        System.out.println(pizzaHut.getTotalPayment());
    }
}