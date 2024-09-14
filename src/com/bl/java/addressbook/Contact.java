package com.bl.java.addressbook;

public class Contact {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email)
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

    public String getInfo()
    {
        return "First name is"+firstName+"Last Name is"+lastName+"Address is "+address+"City is"+city+"State is"+state+"Zip is "+zip+"Phone number is"+phoneNumber+"Email is "+email;
    }
}
