package com.xworkz.oops.polymorphism.internal;

public class CarCompileTime {
    public CarCompileTime(){
        System.out.println("Comapil time");
    }

    //Have same Method Name But Different Parameter
    String carName(String name){
        return "";
    }

    String carName(){
        return "";
    }
}
