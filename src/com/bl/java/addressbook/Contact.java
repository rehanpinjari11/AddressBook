package com.bl.java.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contact {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phNumber;
    String email;
    String contactId;

    public Contact(String firstName,String lastName,String address,String city,String state,String zip,String phNumber,String email ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phNumber=phNumber;
        this.email=email;

    }

    @Override
    public String toString() {
        return "Contact{" +
                "  Name= '" + firstName + " " + lastName + '\'' +
                ", PhoneNumber= '" + phNumber + '\'' +
                ", Email= '" + email + '\'' +
                ", Address= '" + address + '\'' +
                ", City= '" + city + '\'' +
                ", State= '" + state + '\'' +
                ", Zip= '" + zip + '\'' +


                '}';

    }
}
