package org.example.models;

import org.example.Main;
import org.example.models.services.ContactOwnerService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ContactOwner extends CommonFeatures implements ContactOwnerService {
    private String role;
    private String gender;
//    public List<Contact> contactList;
    Main masterList = new Main();
    public ContactOwner() {
    }

    public ContactOwner(String role, String gender) {
        this.role = role;
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public List<Contact> getContactList() {
//        return contactList;
//    }
//
//    public void setContactList(List<Contact> contactList) {
//        this.contactList = contactList;
//    }

    @Override
    public String toString() {
        return "ContactOwner{" +
                "role='" + role + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public String createNewContact(int age, String officePhoneNo, String firstName, String lastName, String email, String phoneNo, Main main) {
        Contact newContact = new Contact();
                newContact.setAge(age);
                newContact.setOfficePhoneNumber(officePhoneNo);
                newContact.setFirstName(firstName);
                newContact.setLastName(lastName);
                newContact.setEmailAddress(email);
                newContact.setPhoneNumber(phoneNo);
                List<Contact> contacts = new ArrayList<>();
                contacts.add(newContact);
        main.myContactList.add(newContact);
        return "Contact saved successfully";
    }

    @Override
    public Contact searchContactByName(String contactName, Main main) {
        List<Contact> contactBook = main.myContactList;
        Contact foundContact = new Contact();
        for (Contact contact : contactBook) {
            String name = contact.getFirstName();
            if(Objects.equals(name, contactName)) {
                foundContact=contact;
                System.out.println(foundContact +" Found contact");
            }
        }
        return foundContact;
    }
}

