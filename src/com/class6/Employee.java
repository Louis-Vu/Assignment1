package com.class6;

import java.util.Scanner;

public class Employee extends Staff {
    String skill;


    public Employee() {
        super();
        bonus = 0.1;
    }

    public String getSkill() {
        return skill;
    }



    @Override
    public void inputData() {
        System.out.println("Create Employee....");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter basic salary($): ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter position: ");
        skill = scanner.nextLine();
        System.out.print("Create successfully. ");
        display();
    }

    @Override
    public void display() {
        System.out.println("This is Employee");
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + salary);
    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update name: ");
        name = scanner.nextLine();
        System.out.print("Update position: ");
        String role = scanner.nextLine();
        System.out.print("Update successfully: ");
        display();
    }
}