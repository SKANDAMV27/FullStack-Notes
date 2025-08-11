package com.xworkz.oops.polymorphism.external;

import com.xworkz.oops.polymorphism.internal.Car;
import com.xworkz.oops.polymorphism.internal.Wagnor;

public class MainRunner {
    public static void main(String[] args) {
        Car car = new Wagnor();
        car.owner();
    }
}
