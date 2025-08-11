package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        Map<Integer ,String> car = new HashMap<>();
        car.put(1,"Wagnor");
        car.put( 2,"Aulto");
        car.put(4,"santro");
        car.put(3,"Shift");
        car.put(10,"Shringer");
        car.put(9,"Thirthahalli");
        car.put(11,"Shivamogga");
        car.put(21,"Koppa");
        car.put(4,"Chikkamangaluru");
        

        System.out.println(car);

        for(Map.Entry<Integer,String> cars : car.entrySet()){
            cars.getKey();
            cars.getValue();
            System.out.print(cars.getKey());
            System.out.println(cars.getValue());
        }
        for(Integer car1 : car.keySet()){
            System.out.println(car1+" "+car.get(car1));
        }
        for(String car2:car.values()){
            System.out.println(car2);
        }
        Map<Integer , String > sort = new TreeMap<>(car);
        System.out.println("Sorted: "+sort);
        
       
        
        
    }
}
