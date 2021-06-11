package MobilePhone;
import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private  ArrayList<Contact> contacts;
    private Scanner scanner = new Scanner(System.in);

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void addContact(String name, String phoneNumber){
        contacts.add(Contact.newContact(name, phoneNumber));
    }
    public boolean searchContact(String name){
        for(int i = 0 ; i < contacts.size() ; i++){
            if(contacts.get(i).getName().equals(name))
                return true;
            else
                return false;
        }
        return false;
    }
//    public int searchContacts(String name){
//        for(int i = 0 ; i < contacts.size() ; i++){
//            if(contacts.get(i).getName().equals(name))
//                return i;
//        }
//        return 0;
//    }
    private int searchContacts(String name){
        for(int i = 0 ; i < contacts.size() ; i++){
            if(contacts.get(i).getName().equals(name))
                return i;
        }
        return 0;
    }

    public void queryContact(String name){
        int index = searchContacts(name);
        if(index >= 0){
            System.out.println("Enter the new name of the contact");
            String newName = scanner.nextLine();
            System.out.println("Enter the new number of the contact");
            String newNumber = scanner.nextLine();
            modifyContact(index,(Contact.newContact(newName, newNumber)));
        }
    }
    public void modifyContact(int index, Contact contact){
        contacts.set(index, contact);
    }
    public void removeContact(String name){
        int index = searchContacts(name);
        contacts.remove(index);
    }

}
