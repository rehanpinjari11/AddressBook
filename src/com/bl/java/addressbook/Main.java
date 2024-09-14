package com.bl.java.addressbook;

import java.util.*;

public class Main {

    public static boolean exit = true;

    public static void options() {
        System.out.println("(1) Create New Contact\n(2) Edit Contact\n(3) Display\n(4) Exit");
        Scanner sc = new Scanner(System.in);
        Contact obj = new Contact();
        int option = sc.nextInt();

        switch (option) {
            case 1:
                obj.addContact();
                break;
            case 2:
                obj.updateContact();
                break;
            case 3:
                System.out.println(obj.getInfo());
                break;
            case 4:
                exit = false;
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("******Welcome to Address Book*******");
        while (exit) {
            options();
        }
    }
}
