
import controller.ManagerContact;
import java.util.ArrayList;
import model.Contact;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thao Chi
 */
public class Main {
     public static void main(String[] args) {
        String title = "Menu";
        String[] s = new String[]{"Add a contact ", "Display all contact", 
            "Delete a contact","Exit"};
        Menu<String> menu = new ManagerContact(title, s);
         ArrayList<Contact> lc = new ArrayList<>();
        lc.add(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        lc.add(new Contact(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        lc.add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        menu.run();
    }
}
