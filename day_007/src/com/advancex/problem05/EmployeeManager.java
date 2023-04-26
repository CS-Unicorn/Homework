package com.advancex.problem05;

public class EmployeeManager {
    public void print(Employee[] all) {
        for (int i = 0; i < all.length; i++) {
            all[i].printInfo();
        }
    }

    public void sort(Employee[] all) {
        for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all.length - i - 1; j++) {
                if (all[j].age > all[j + 1].age) {
                    Employee temp = all[j];
                    all[j] = all[j + 1];
                    all[j + 1] = temp;
                }
            }
        }
    }

    public void addSalary(Employee[] all, double increament) {
        for (int i = 0; i < all.length; i++) {
            all[i].salary += increament;
        }
    }
}
