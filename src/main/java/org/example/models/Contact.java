package org.example.models;

import java.time.LocalDateTime;

public class Contact extends CommonFeatures{
    private int age;
    private String officePhoneNumber;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress, LocalDateTime createdTime, int age, String officePhoneNumber) {
        super(firstName,  lastName,  phoneNumber,  emailAddress,  createdTime);
        this.age = age;
        this.officePhoneNumber = officePhoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public void setOfficePhoneNumber(String officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{} " + super.toString();
    }
}
