/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import view.Validation;
import java.util.ArrayList;

/**
 *
 * @author Thao Chi
 */
public class ContactList {
    ArrayList<Contact> lc = new ArrayList<Contact>();
    private Validation validation;
    
     public void createContact() {
        System.out.print("Enter id contact: ");
        int contactId = validation.checkInputInt();
        System.out.print("Enter first name: ");
        String firstName = validation.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = validation.checkInputString();
        System.out.print("Enter group: ");
        String group = validation.checkInputString();
        System.out.print("Enter address: ");
        String address = validation.checkInputString();
        System.out.print("Enter phone: ");
        String phone = validation.checkInputPhone();
        lc.add(new Contact(contactId, firstName + lastName, group, address,
                phone, firstName, lastName));
        System.err.println("Add successful.");
    }

    //allow user display all contact
    public void printAllContact() {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        //print infomation of contact from first to last list contact
        for (Contact contact : lc) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    //allow user delete contact
    public void deleteContactd() {
        System.out.print("Enter id: ");
        int idDelete = validation.checkInputInt();
        Contact contactDelete = getContactById(idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }

    //get contact by id
    public Contact getContactById(int idDelete) {
        for (Contact contact : lc) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }
}
