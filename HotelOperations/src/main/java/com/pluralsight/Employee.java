package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;
    private double punchInTime;


    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
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
        if (hoursWorked < 40) {
            return hoursWorked;
        } else {
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


    public void punchIn() {
        LocalDateTime punchIn = LocalDateTime.now();
        double hours = punchIn.getHour();
        double fractionOfHour = punchIn.getMinute() / 60f;
        this.punchInTime = (hours + fractionOfHour);

    }


    public void punchOut() {
        LocalDateTime punchOut = LocalDateTime.now();
        double hours = punchOut.getHour();
        double minutes = punchOut.getMinute();
        double fractionOfHour = punchOut.getMinute() / 60f;
        double punchOutTime = hours + fractionOfHour;

        this.hoursWorked += (punchOutTime - this.punchInTime);

    }

}






