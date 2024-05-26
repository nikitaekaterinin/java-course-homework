package org.example.homework9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("045", new ArrayList<Contact>());

        var cont1 = (Contact.createContact("Kate", "025"));
        var cont2 = (Contact.createContact("Max", "026"));
        var cont3 = (Contact.createContact("Jake", "027"));
        var cont4 = (Contact.createContact("Bob", "028"));
        var cont5 = (Contact.createContact("Jake", "027"));

        mobilePhone.addNewContact(cont1);
        mobilePhone.addNewContact(cont2);
        mobilePhone.addNewContact(cont3);
        mobilePhone.addNewContact(cont5);

        mobilePhone.removeContact(cont1);

       mobilePhone.updateContact(cont2, cont4);

        mobilePhone.queryContact("Max");

        mobilePhone.printContacts();
    }
}