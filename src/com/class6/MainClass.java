package com.class6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    private static Staff[] list;

    public static void main(String[] args) {

        Staff person;

        Scanner scanner = new Scanner(System.in);

        mainMenuLoop:
        while (true) {
            System.out.println();
            System.out.println("===== Welcome to Company Management software =====");
            System.out.println("1. Create new person");
            System.out.println("2. Show all person");
            System.out.println("3. Search for person by ID");
            System.out.println("4. Update person information");
            System.out.println("5. View employee's salary");
            System.out.println("6. Update salary for staff");
            System.out.println("7. Exit");
            System.out.print("Enter your selection(1 - 7): ");
            int selectedMenu = Integer.parseInt(scanner.nextLine());
            switch (selectedMenu) {
                case 1 -> {
                    createNewPerson();
                }
                case 2 -> {
                    displayAllPeople();
                }
                case 3 -> {
                    findPerson();
                }
                case 4 -> {
                    updatePerson();
                }
                case 5 -> {
                    checkSalary();
                }
                case 6 -> {
                    updateSalary();
                }
                case 7 -> {
                    break mainMenuLoop;
                }
            }
        }
    }

    private static void createNewPerson() {
        Scanner scanner = new Scanner(System.in);
        int selectedMenu = 0;
        createNewPersonLoop:
        while (true) {
            System.out.println();
            System.out.println("===== Create new person =====");
            System.out.println("1. Director");
            System.out.println("2. Manager");
            System.out.println("3. Employee");
            System.out.print("What person do you want to create? (1 - 3, or press Q to return to the homepage): ");
            try {
                selectedMenu = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break createNewPersonLoop;
            }
            switch (selectedMenu) {
                case 1 -> {
                    selectedMenu = new Director().getId();
                }
                case 2 -> {
                    selectedMenu = new Manager().getId();
                }
                case 3 -> {
                    selectedMenu = new Employee().getId();
                }
            }
            selectedMenu.inputData();
            scanner.radix();
        }

    }

    private static void displayAllPeople() {

        System.out.println("Showing... " + list);
        for (Staff person : list) {
            person.display();
        }
    }

    private static void findPerson() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop:
        while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the ID of the person you want to search (or Q to return): ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            Staff result = findPersonById(id);
            if (result != null) {
                System.out.print("Found 1 match: ");
                result.display();
            } else {
                System.out.println("No result is found");
            }
        }

    }

    private static Staff findPersonById(int id) {
        for (Staff person : list) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    private static void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop:
        while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the ID of the personnel you want to update(or press Q to return): ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            Staff result = findPersonById(id);
            if (result != null) {
                System.out.print("Found 1 match: ");
                result.display();
                result.updatePerson();
            } else {
                System.out.println("No result is found");
            }
        }
    }

    private static void checkSalary() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop:
        while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the ID of the employee you want to see salary (or press Q to return): ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            Staff result = findPersonById(id);
            if (result != null) {
                System.out.print("Found 1 match: ");
                result.display();
            } else {
                System.out.println("No result is found");
            }
        }
    }

    private static void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        findPersonLoop:
        while (true) {
            System.out.println();
            int id;
            System.out.print("Enter the ID of the person you want to update (or press Q to return): ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                break findPersonLoop;
            }
            Staff result = findPersonById(id);
            if (result != null) {
                System.out.print("Found 1 match: ");
                result.display();
                result.updateSalary();
            } else {
                System.out.println("No result is found");
            }
        }
    }
}


