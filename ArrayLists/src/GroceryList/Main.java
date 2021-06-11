package GroceryList;
import GroceryList.GroceryList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> groceryList.printGroceryList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchItem();
                case 6 -> quit = true;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print the choice options");
        System.out.println("\t 1 - To print the list of items currently in the list");
        System.out.println("\t 2 - To add an item to the list ");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search an item in the list");
        System.out.println("\t 6 - To exit the application");
    }
    public static void addItem(){
        System.out.println("Enter the name of the item you want to add");
        String newItem = scanner.nextLine();
        groceryList.addGroceryItem(newItem);
    }
    public static void modifyItem(){
        System.out.println("Enter the item which you want to modify");
        String oldItem = scanner.nextLine();
        System.out.println("Enter the name of the item with which you want to modify item ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }
    public static void removeItem(){
        System.out.println("Enter the item which you want to remove");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }
    public static void searchItem(){
        System.out.println("Enter the name of the item which you want to search in the list");
        String searchItem = scanner.nextLine();
        groceryList.searchItem(searchItem);
    }
}
