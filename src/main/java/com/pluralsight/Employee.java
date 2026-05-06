package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int shiftStart;

    Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        shiftStart = -1;
    }

    public void punchIn(int time){
        shiftStart = time;
    }
    public void punchIn(){
        shiftStart = LocalTime.now().getHour();
    }

    public void punchOut(int time){
        int shiftTime = 0;
        if (time < shiftStart){
            shiftTime = (24 - shiftStart) + time;
        } else {
            shiftTime = shiftStart - time;
        }
        hoursWorked += shiftTime;
    }

    public void punchOut(){
        int clockOutTime = LocalTime.now().getHour();
        int shiftTime = 0;
        if (clockOutTime < shiftStart){
            shiftTime = (24 - shiftStart) + clockOutTime;
        } else {
            shiftTime = shiftStart - clockOutTime;
        }
        hoursWorked += shiftTime;
    }

    public void punchTimeCard(int timeIn, int timeOut){
        int shiftTime = 0;
        if (timeIn > 24 || timeOut > 24){
            System.out.println("Invalid time");
            return;
        }else if (timeOut < timeIn){
            shiftTime = (24 - timeIn) + timeOut;
        } else {
            shiftTime = timeOut - timeIn;
        }
        hoursWorked += shiftTime;
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
