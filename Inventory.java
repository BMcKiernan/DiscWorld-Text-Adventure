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
    int items=0;
    
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
        items++;
    }
    
    /**
     * Method that returns the index of an Item.
     */
    public int getItemIndex(Item itemToIndex){
        int index = inventory.indexOf(itemToIndex);
        return index;
    }
    
    /**
     * Method that returns the Item found with an Index.
     */
    public Item getItem(int indexForItem){
        Item itemToReturn = inventory.get(indexForItem);
        return itemToReturn;
    }
    
    /**
     * This method returns the size of the array which has been tracked by an incrementor.
     */
    public int size()
    {
        return items;
    }
    
    /**
     * removeItem method removes an item from the inventory array.
     */
    public void removeItem(Item itemToRemove){
        inventory.remove(itemToRemove);
        items--;
    }
}
