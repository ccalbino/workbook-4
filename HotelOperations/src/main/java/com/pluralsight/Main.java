package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testEmployee();


    }

    public static void testEmployee(){
        Employee p1 = new Employee(738495, "Bino", "IT", 30);
        p1.punchIn();
        System.out.println(p1.getTotalPay());


    }



}