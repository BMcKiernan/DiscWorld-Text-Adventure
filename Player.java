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
    ArrayList<String> equipment;
    
    /**
     * No-Arg Constructor for player which intializes arrays.
     */
    public Player()
    {
        inventory = new ArrayList<String>();
        equipment = new ArrayList<String>();
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
    
    /**
     * equipItem method passes a string to the inventory array. After the inventory array verifies it has the
     * item it then passes it to the equipment array 
     */
    public void equipItem(String equipItem)
    {
        if(inventory.contains(equipItem))
        {
            int index = inventory.indexOf(equipItem);
            equipment.add(inventory.get(index));
            System.out.printf("\n You just equipped %s \n",equipItem);
            inventory.remove(equipItem);
        }
        else if (equipment.contains(equipItem))
        {
            System.out.printf("\n %s is already equpped\n",equipItem);
        }
        else
        {
           System.out.println("There is no such item to equip"); 
        }
    }
    
    
    
}
    
