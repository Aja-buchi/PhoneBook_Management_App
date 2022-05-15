package org.example.models;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

abstract class CommonFeatures {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private LocalDateTime createdTime = LocalDateTime.now();

    public CommonFeatures() {
    }

    public CommonFeatures(String firstName, String lastName, String phoneNumber, String emailAddress, LocalDateTime createdTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.createdTime = createdTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "CommonFeatures{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}
