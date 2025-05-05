package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    private Employee(int employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }


    public int getEmployeeId() {
        return employeeId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        if(hoursWorked < 40) {
            return hoursWorked;
        }else {
            return 40;
        }
    }

    public double getOverTimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public double getTotalPay() {
        return (getOverTimeHours() * payRate * 1.5) + (getRegularHours() * payRate);
        }
    }





}
