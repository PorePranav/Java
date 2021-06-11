package GroceryList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0 ; i < groceryList.size() ; i++){
            System.out.println(groceryList.get(i));
        }
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set((position), newItem);
        System.out.println("Grocery item " + position + " has been modified." );
    }
    public void modifyGroceryItem(String oldItem, String newItem){
        int position = findItem(oldItem);
        if(position >= 0 ){
            modifyGroceryItem(position, newItem);
        }
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            groceryList.remove(position);
            System.out.println("The grocery item : " + item+ " has been removed from the list");
        }
        else {
            System.out.println("No item with the name " + item + " was found in the list for removal");
        }

    }
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }
    public void searchItem(String searchItem){
        if(findItem(searchItem) >= 0){
            System.out.println("Item " + searchItem + " found in the list of grocery items.");
        }
        else{
            System.out.println("The item " + searchItem + " not found in the list");
        }
    }
}
