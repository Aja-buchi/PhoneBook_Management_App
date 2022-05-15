package org.example.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private LocalDateTime createdTime = LocalDateTime.now();
    private List<Contact> phoneBook = new ArrayList<>();

    public Phonebook() {
    }

    public Phonebook(LocalDateTime createdTime, List<Contact> phoneBook) {
        this.createdTime = createdTime;
        this.phoneBook = phoneBook;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public List<Contact> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(List<Contact> phoneBook) {
        this.phoneBook = phoneBook;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "createdTime=" + createdTime +
                ", phoneBook=" + phoneBook +
                '}';
    }
}
