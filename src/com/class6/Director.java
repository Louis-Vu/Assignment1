package com.class6;

import java.util.Scanner;

public class Director extends Staff {
    private String role;

    public Director() {
        super();
        double bonus = 0.5;
    }


    public String getRole() {
        return role;
    }
    @Override
    public void inputData() {
        System.out.println("Create Director");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("enter basic salary ($): ");
        salary = (int) Double.parseDouble(scanner.nextLine());
        System.out.print("enter position: ");
        role = scanner.nextLine();
        System.out.print("Create successfully. ");
        display();
        }

    @Override
    public void display() {
        System.out.println("This is an Director");
        System.out.println("Name" + name);
        System.out.println("Basic salary" + salary);
    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Update name: ");
        name = scanner.nextLine();
        System.out.print("Update role: ");
        role = scanner.nextLine();
        System.out.print("Update successfully: ");
        display();
    }
}
