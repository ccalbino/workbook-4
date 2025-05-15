package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity("5");

        Car c1 = new Car();
        c1.color = "blue";

        System.out.println(slowRide.getColor());
        System.out.println(c1.getColor());




    }
}