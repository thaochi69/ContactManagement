/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import model.ContactList;
import view.Menu;


/**
 *
 * @author Thao Chi
 */
public class ManagerContact extends Menu<String>{
    private ContactList list= new ContactList();
    public ManagerContact(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.createContact();
                break;
            case 2:
                list.printAllContact();
                break;
            case 3:
                list.deleteContactd();
                break;
            case 4:
                System.exit(0);        
        }
    }
}
