package Employee_Payment_System;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculatePay(double hours, double rate);
}