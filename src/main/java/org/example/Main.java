package org.example;

import org.example.models.Contact;
import org.example.models.ContactOwner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<Contact> myContactList = new ArrayList<>();

    public static void main(String[] args) {
        Main ma = new Main();
        ContactOwner Steven = new ContactOwner();
            Steven.setFirstName("Steven");
            Steven.setLastName("Brown");
            Steven.setGender("Male");
            Steven.setEmailAddress("brown@gmail.com");
            Steven.setPhoneNumber("08056324167");
            Steven.setRole("Owner");

         //Created contacts
        System.out.println(Steven.createNewContact(24,"09056634423", "Victor",
                "Abayomi", "victor@gmail.com", "0706554238",ma));
        System.out.println(Steven.createNewContact(19,"07068559234", "Esther",
                "Onyemaechi", "esther@gmail.com", "08010224478",ma));

        System.out.println(Steven.createNewContact(40,"07099774412", "Deen",
                "McLiver", "deen@gmail.com", "09041030521",ma));


        System.out.println("*********************************************************");
//        System.out.println(ma.myContactList + " List of contacts");
//        System.out.println(ma.myContactList.size());
        System.out.println("*********************************************************");
        Steven.searchContactByName("Esther",ma);

    }
}
