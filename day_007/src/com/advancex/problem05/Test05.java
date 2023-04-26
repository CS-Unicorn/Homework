package com.advancex.problem05;

public class Test05 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
        }
        employees[0].setInfo(001, "李小一", 10000, 24);
        employees[1].setInfo(002, "王小二", 11000, 22);
        employees[2].setInfo(003, "张小三", 12000, 28);
        employees[3].setInfo(004, "刘小四", 13000, 18);
        employees[4].setInfo(005, "赵小五", 14000, 19);

        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }
        System.out.println("=======================");

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.sort(employees);
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }

        System.out.println("=======================");
        employeeManager.addSalary(employees,1000);
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }
    }
}
