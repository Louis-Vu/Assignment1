package com.class6;

import java.util.Scanner;

public abstract class Staff {

    private static int count = 0;
    protected int id;
    protected String name;
    protected double bonus;
    protected double salary;

    public Staff() {
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary() {
        return salary;
    }

    public double getTotalSalary() {
        return bonus * salary + salary;
    }

    public abstract void inputData();
    public abstract void display();
    public abstract void updatePerson();
    public void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update new salary ($): ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.printf("Updated: New basic salary = $%.2f%n", salary);
    }
}


