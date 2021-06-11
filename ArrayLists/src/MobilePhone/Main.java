package MobilePhone;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit){

            printInstructions();
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 -> printInstructions();
                case 1 -> addContact();
                case 2 -> listContacts();
                case 3 -> modifyContacts();
                case 4 -> removeContact();
                case 5 -> quit = true;
            }
        }
    }
    public static void printInstructions(){
        System.out.println(" 0 - To print instructions");
        System.out.println(" 1 - To add a contact");
        System.out.println(" 2 - To list contacts");
        System.out.println(" 3 - To modify a contact");
        System.out.println(" 4 - To remove a contact");
        System.out.println(" 5 - To quit the application");
    }
    public static void addContact(){
        System.out.println("Enter the name of the contact");
        String name = scanner.nextLine();

        System.out.println("Enter the phone number");
        String phoneNumber = scanner.nextLine();
        if(mobilePhone.getContacts().size() == 0){
            mobilePhone.addContact(name, phoneNumber);
        }
        else if (mobilePhone.searchContact(name))
            System.out.println("The contact already exists");
        else
            mobilePhone.addContact(name, phoneNumber);
    }
    public static void listContacts(){
        System.out.println("You have " + mobilePhone.getContacts().size() + " contacts in your list");
        for(int i = 0 ; i < mobilePhone.getContacts().size() ; i++){
            System.out.println("#" + (i+1) + " " + mobilePhone.getContacts().get(i).getName() + " Number is : " + mobilePhone.getContacts().get(i).getContactNumber());
        }
    }
    public static void modifyContacts(){
        System.out.println("Enter the name of the contact which you want to modify");
        String name = scanner.nextLine();
        mobilePhone.queryContact(name);

    }
    public static void removeContact(){
        System.out.println("Enter the name of the contact you want to remove");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }
}
