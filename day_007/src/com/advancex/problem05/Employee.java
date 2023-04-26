package com.advancex.problem05;

public class Employee {
    int id;
    String name;
    double salary;
    int age;

    public void printInfo() {
        System.out.println("id:" + id + "\tname:" + name + "\tsalary:" + salary + "\tage:" + age);
    }

    public void setInfo(int i, String n, double s, int a) {
        id = i;
        name = n;
        salary = s;
        age = a;
    }
}
