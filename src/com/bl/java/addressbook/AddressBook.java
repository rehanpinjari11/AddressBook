package com.bl.java.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import java.util.*;

public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (isDuplicate(contact)) {
            System.out.println("Duplicate entry found for: " + contact.firstName + " " + contact.lastName);
            return false;
        } else {
            contacts.add(contact);
            System.out.println("Contact added: " + contact.firstName + " " + contact.lastName);
            return true;
        }
    }

    public boolean isDuplicate(Contact contact) {
        return contacts.stream()
                .anyMatch(existingContact -> existingContact.equals(contact));
    }

    public Contact getContact(String firstName, String lastName) {
        return contacts.stream()
                .filter(contact -> contact.firstName.equals(firstName) && contact.lastName.equals(lastName))
                .findFirst()
                .orElse(null);
    }

    public void removeContact(String firstName, String lastName) {
        contacts.removeIf(contact -> contact.firstName.equals(firstName) && contact.lastName.equals(lastName));
    }

    public void listContacts() {
        contacts.forEach(System.out::println);
    }

    public static void addressBookMenu(AddressBook addressBook) {
        Scanner scanner = new Scanner(System.in);
        boolean exit_break = true;

        while (exit_break) {
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
                    break;
                case 2:
                    System.out.print("Enter first name to retrieve: ");
                    String firstNameToRetrieve = scanner.nextLine();
                    System.out.print("Enter last name to retrieve: ");
                    String lastNameToRetrieve = scanner.nextLine();
                    Contact contactToRetrieve = addressBook.getContact(firstNameToRetrieve, lastNameToRetrieve);
                    if (contactToRetrieve != null) {
                        System.out.println("Contact found: " + contactToRetrieve);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter first name to remove: ");
                    String firstNameToRemove = scanner.nextLine();
                    System.out.print("Enter last name to remove: ");
                    String lastNameToRemove = scanner.nextLine();
                    addressBook.removeContact(firstNameToRemove, lastNameToRemove);
                    System.out.println("Contact removed if it existed.");
                    break;
                case 4:
                    System.out.println("Listing all contacts:");
                    addressBook.listContacts();
                    break;
                case 5:
                    exit_break = false;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

    public static void main(String[] args) {
    }

}
