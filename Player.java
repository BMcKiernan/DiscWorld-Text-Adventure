import java.util.ArrayList;
/**
 * Write a description of class Player here.
 * 
 * @author Brian McKiernan
 * @Nathan Paget
 * @version 11/10/26
 */
public class Player
{
    ArrayList<String> inventory;
    ArrayList<String> equipped;
    
    /**
     * No-Arg Constructor for player which intializes arrays.
     */
    public Player()
    {
        inventory = new ArrayList<String>();
        equipped = new ArrayList<String>();
    }
    
    /**
     * addItem method adds an item to the inventory array;
     */
    public void addItem(String itemToAdd){
        inventory.add(itemToAdd);
    }
    
    /**
     * removeItem method removes an item from the inventory array.
     */
    public void removeItem(String itemToRemove){
        inventory.remove(itemToRemove);
    }
    
    /**
     * displayItems method prints out the items in the players inventory.
     */
    public void displayItems(){
        
        if(inventory.get(0)==null)
        {
            System.out.println("You do not have any items in your inventory");
        }
        else
        {
            System.out.println("The contents of your inventory are:");
            for(int i = 0; i<inventory.size(); i++)
            {
                String itemString;
                itemString = inventory.get(i);
                System.out.print(itemString);
            }
        }
        System.out.println();
    }
    
    
}
    
