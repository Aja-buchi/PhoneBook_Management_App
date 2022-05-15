package org.example.models.services;

import org.example.Main;
import org.example.models.Contact;

public interface ContactOwnerService {
    String createNewContact(int age, String officePhoneNo, String firstName, String lastName, String email, String phoneNo, Main main);
    Contact searchContactByName(String contactName, Main main);
}
