package com.Associations;

public class ProcessorCom {
    public static void main(String[] args) {

     Computer c1=new Computer("Hp");





    }

}


class Processor{

    private  String id;
    private float processorEfficiency;

    public float clockSpeed(float cyclesPerSecond){
        this.processorEfficiency = cyclesPerSecond*4;
        return processorEfficiency;
    }



}
class Computer{
    private String name;
    private Processor p;
    Computer(String name){
        this.name=name;
        this.p=new Processor();
    }




}