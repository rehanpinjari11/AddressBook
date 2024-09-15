package com.bl.java.addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<String, AddressBook> books = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void addAddressBook(String name) {
        if (books.containsKey(name)) {
            System.out.println("AddressBook already exists with the name: " + name);
        } else {
            books.put(name, new AddressBook());
            System.out.println("AddressBook added successfully");
        }
    }

    public static void performOperation(String bookName) {
        AddressBook addressBook = books.get(bookName);
        if (addressBook != null) {
            AddressBook.addressBookMenu(addressBook);
        } else {
            System.out.println("No AddressBook found with the name: " + bookName);
        }
    }

    public static void listAddressBooks() {
        System.out.println("Available AddressBooks:");
        for (String name : books.keySet()) {
            System.out.println(name);
        }
    }

    public static void menu() {
        System.out.println("Welcome to AddressBook");
        boolean exit = true;
        while (exit) {
            System.out.println("\n1. Add New AddressBook");
            System.out.println("2. Perform Operation in AddressBook");
            System.out.println("3. Print Available AddressBooks");
            System.out.println("4. Exit");
            System.out.println("Enter a choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.println("Enter Name of AddressBook: ");
                    String name = sc.nextLine();
                    addAddressBook(name);
                    break;
                case 2:
                    System.out.println("Enter the AddressBook name to perform operations on: ");
                    String bookName = sc.nextLine();
                    performOperation(bookName);
                    break;
                case 3:
                    listAddressBooks();
                    break;
                case 4:
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
