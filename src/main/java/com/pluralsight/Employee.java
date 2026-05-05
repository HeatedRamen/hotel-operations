package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){ return (hoursWorked < 40) ? hoursWorked * payRate : (40 * payRate) + ((1.5 * payRate) * getOvertimeHours());}
    public double getRegularHours() { return (hoursWorked < 40) ? hoursWorked : 40;}
    public double getOvertimeHours() { return (hoursWorked < 40) ? 0 : hoursWorked - 40;}

    @Override
    public String toString() {
        return "Name: "+ name +
                "\nRegular Hours: " + getRegularHours() + " Overtime Hours: " + getOvertimeHours() +
                "\nTotal Pay: " + getTotalPay();
    }
}
