package com.bl.java.addressbook;

import java.util.*;

public class AddressBook {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public AddressBook(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static void main(String[] args)
    {
        ArrayList<String> Contact = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String first_name = sc.nextLine();
        Contact.add(first_name);
        System.out.println("Enter Last name");
        String last_name = sc.nextLine();
        Contact.add(last_name);
        System.out.println("Enter Address");
        String address = sc.nextLine();
        Contact.add(address);
        System.out.println("Enter City");
        String city = sc.nextLine();
        Contact.add(city);
        System.out.println("Enter State");
        String state = sc.nextLine();
        Contact.add(state);
        System.out.println("Enter ZIp");
        String zip = sc.nextLine();
        Contact.add(zip);
        System.out.println("Enter Phone number");
        String ph_number = sc.nextLine();
        Contact.add(ph_number);
        System.out.println("Enter Email");
        String email = sc.nextLine();
        Contact.add(email);
        for(int i = 0;i<Contact.size();i++){
            System.out.println(Contact.get(i));
        }
    }

}
