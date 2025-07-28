package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        Contact contact1 = new Contact("Bob", "31415926");
        Contact contact2 = new Contact("Alice", "16180339");

        // Yeni contact ekleme
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);

        // Contact'ları listeleme
        mobilePhone.printContacts();

        // Contact güncelleme
        Contact newContact = new Contact("Bob", "12345678");
        mobilePhone.updateContact(contact1, newContact);

        // Contact'ları tekrar listeleme
        mobilePhone.printContacts();

        // Contact silme
        mobilePhone.removeContact(newContact);

        // Contact'ları tekrar listeleme
        mobilePhone.printContacts();
    }
}