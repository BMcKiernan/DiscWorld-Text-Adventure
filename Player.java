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
    Inventory playerInventory;
    Inventory equipment;
    
    /**
     * No-Arg Constructor for player which intializes arrays.
     */
    public Player()
    {
        playerInventory = new Inventory();
        equipment = new Inventory();
    }
    
    /**
     * displayItems method prints out the items in the players inventory.
     */
    public void displayItems(){
        if(playerInventory.size()==0)
        {
            System.out.println("You do not have any items in your inventory");
        }
        else
        {
            System.out.print("\nThe contents of your inventory are: ");
            for(int i = 0; i<playerInventory.size(); i++)
            {
                Item itemForString;
                itemForString = playerInventory.getItem(i);
                String itemName = itemForString.getName();
                System.out.print(itemName);
            }
        }
        System.out.println();
    }
    
    //     /**
    //      * equipItem method passes a string to the inventory array. After the inventory array verifies it has the
    //      * item it then passes it to the equipment array 
    //      */
    //     public void equipItem(Item itemToEquip)
    //     {
    //         if(playerInventory.contains(itemToEquip))
    //         {
    //             
    //           
    //         else
    //         {
    //            System.out.println("There is no such item to equip"); 
    //         }
    //        
    //     
    //     
    //     
 }
    
