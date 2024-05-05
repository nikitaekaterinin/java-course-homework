package org.example.homework9;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact) {
        int index = findContact(contact);
        if (index >= 0) {
            System.out.println("Such contact already exists.");
            return false;
        } else {
            myContacts.add(contact);
            System.out.println("Contact '" + contact.getName() + "' added successfully.");
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index >= 0) {
            myContacts.set(index, newContact);
            System.out.println("Contact '" + oldContact.getName() + "' was replaced by contact '" + newContact.getName() + "'.");
            return true;
        } else {
            System.out.println("No such contact.");
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index >= 0) {
            myContacts.remove(contact);
            System.out.println("Contact '" + contact.getName() + "' was removed successfully.");
            return true;
        } else {
            System.out.println("No such contact.");
            return false;
        }
    }

    public int findContact(Contact contact) {
        int index = myContacts.indexOf(contact);
        if (index >= 0) {
            return index;
        } else {
            return -1;
        }
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contactName.equals(contact.getName())) {
                System.out.println("Looked contact number is: " + contact.getPhoneNumber());
                return contact;
            }
        }
        System.out.println("There is no such contact.");
        return null;
    }

    public void printContacts() {
        System.out.println("Contacts list:");
        for (Contact contact : myContacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}