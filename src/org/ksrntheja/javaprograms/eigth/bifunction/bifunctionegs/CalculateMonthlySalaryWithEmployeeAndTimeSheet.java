package org.ksrntheja.javaprograms.eigth.bifunction.bifunctionegs;

import java.util.function.BiFunction;

class Employee {

    int eno;
    String name;
    double dailyWage;

    Employee(int eno, String name, double dailyWage) {
        this.eno = eno;
        this.name = name;
        this.dailyWage = dailyWage;
    }

}


class TimeSheet {

    int eno;
    int days;

    TimeSheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }

}


public class CalculateMonthlySalaryWithEmployeeAndTimeSheet {

    public static void main(String[] args) {

        BiFunction<Employee, TimeSheet, Double> CalculateMonthlyBiFunction = (employee, timeSheet) ->
                employee.dailyWage * timeSheet.days;

        Employee e = new Employee(101, "KSRN THEJA", 1500);
        TimeSheet t = new TimeSheet(101, 25);

        System.out.println("Employee Monthly Salary: " + CalculateMonthlyBiFunction.apply(e, t));

    }

}

/*
Employee Monthly Salary: 37500.0
 */