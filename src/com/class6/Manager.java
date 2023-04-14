package com.class6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Manager extends Staff {
    private String department;

    public Manager() {
        super();
        bonus = 0.3;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void inputData() {
        System.out.println("Enter Manager");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter basic salary($): ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter position: ");
        department = scanner.nextLine();
        System.out.print("Create successfully. ");
        display();
    }

    @Override
    public void display() {

    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update name: ");
        name = scanner.nextLine();
        System.out.print("Update position: ");
        department = scanner.nextLine();
        System.out.print("Update successfully: ");
        display();
    }
}