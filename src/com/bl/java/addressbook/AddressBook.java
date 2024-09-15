package com.bl.java.addressbook;

import java.util.*;

public class AddressBook {

    private HashMap<String, Contact> contacts;

    public AddressBook() {
        contacts = new HashMap<>();
    }

    public boolean addContact(Contact contact) {
        String fullName = contact.firstName + " " + contact.lastName;
        contacts.put(fullName, contact);
        return true;

    }

    public Contact getContact(String name) {
        return contacts.get(name);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void listContacts() {
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void addressBookMenu(AddressBook addressBook) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Retrieve Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. List Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter state: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter zip code: ");
                    String zip = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(contact);
                    System.out.println("Contact added.");
                    break;
                case 2:
                    System.out.print("Enter full name to retrieve: ");
                    String nameToRetrieve = scanner.nextLine();
                    Contact contactToRetrieve = addressBook.getContact(nameToRetrieve);
                    if (contactToRetrieve != null) {
                        System.out.println("Contact found: " + contactToRetrieve);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter full name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    addressBook.removeContact(nameToRemove);
                    System.out.println("Contact removed if it existed.");
                    break;
                case 4:
                    System.out.println("Listing all contacts:");
                    addressBook.listContacts();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {

    }

}
