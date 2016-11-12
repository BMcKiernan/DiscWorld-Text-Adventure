import java.util.ArrayList;
/**
 * Write a description of class Inventory here.
 * 
 * @author Brian McKiernan Nathan Paget
 * @version 11/11/2016
 */
public class Inventory
{
    ArrayList<Item> inventory;
    
    /**
     * No-Arg Constructor that intializes a new ArrayList for an Inventory.
     */
    public Inventory(){
        inventory = new ArrayList<Item>();
    }
    
    /**
     * addItem method adds an item to the inventory array;
     */
    public void addItem(Item itemToAdd){
        inventory.add(itemToAdd);
    }
    
    //public Item getItem(Item 
    
    /**
     * removeItem method removes an item from the inventory array.
     */
    public void removeItem(Item itemToRemove){
        inventory.add(itemToRemove);
    }
}
