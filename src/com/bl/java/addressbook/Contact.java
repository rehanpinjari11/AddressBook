package com.bl.java.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    private static HashMap<String, String> person = new HashMap<>();

    public Contact() {
    }

    public void addContact() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name");
        String first_name = sc.nextLine();
        person.put("firstName", first_name);

        System.out.println("Enter Last Name");
        String last_name = sc.nextLine();
        person.put("lastName", last_name);

        System.out.println("Enter Address");
        String address = sc.nextLine();
        person.put("address", address);

        System.out.println("Enter City");
        String city = sc.nextLine();
        person.put("city", city);

        System.out.println("Enter State");
        String state = sc.nextLine();
        person.put("state", state);

        System.out.println("Enter Zip");
        String zip = sc.nextLine();
        person.put("zip", zip);

        System.out.println("Enter Phone Number");
        String phoneNumber = sc.nextLine();
        person.put("phoneNumber", phoneNumber);

        System.out.println("Enter Email");
        String email = sc.nextLine();
        person.put("email", email);
    }

    public void updateContact() {
        System.out.println("Enter Value to Change\n(1) First name\n(2) Last name\n(3) Address\n(4) City\n(5) State\n(6) Zip\n(7) Phone Number\n(8) Email");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine();  // Consume newline left-over
        String newValue;

        switch (option) {
            case 1:
                System.out.println("Enter new First name:");
                newValue = sc.nextLine();
                person.replace("firstName", newValue);
                break;
            case 2:
                System.out.println("Enter new Last name:");
                newValue = sc.nextLine();
                person.replace("lastName", newValue);
                break;
            case 3:
                System.out.println("Enter new Address:");
                newValue = sc.nextLine();
                person.replace("address", newValue);
                break;
            case 4:
                System.out.println("Enter new City:");
                newValue = sc.nextLine();
                person.replace("city", newValue);
                break;
            case 5:
                System.out.println("Enter new State:");
                newValue = sc.nextLine();
                person.replace("state", newValue);
                break;
            case 6:
                System.out.println("Enter new Zip:");
                newValue = sc.nextLine();
                person.replace("zip", newValue);
                break;
            case 7:
                System.out.println("Enter new Phone Number:");
                newValue = sc.nextLine();
                person.replace("phoneNumber", newValue);
                break;
            case 8:
                System.out.println("Enter new Email:");
                newValue = sc.nextLine();
                person.replace("email", newValue);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }


    public String getInfo() {
        System.out.println("Updated Contact Information:");
        StringBuilder output = new StringBuilder();
        for (Map.Entry<String, String> entry : person.entrySet()) {
            output.append(entry.getKey()).append(" is: ").append(entry.getValue()).append("\n");
        }
        return output.toString();
    }
}
