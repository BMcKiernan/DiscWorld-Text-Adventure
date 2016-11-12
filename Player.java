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
        
//         if(playerInventory.get(0)==null)
//         {
//             System.out.println("You do not have any items in your inventory");
//         }
//         else
//         {
//             System.out.println("The contents of your inventory are:");
//             for(int i = 0; i<inventory.size(); i++)
//             {
//                 String itemString;
//                 itemString = inventory.get(i);
//                 System.out.print(itemString);
//             }
//         }
//         System.out.println();
    }
    
    /**
     * equipItem method passes a string to the inventory array. After the inventory array verifies it has the
     * item it then passes it to the equipment array 
     */
    public void equipItem(String equipItem)
    {
//         if(inventory.contains(equipItem))
//         {
//             int index = inventory.indexOf(equipItem);
//             equipment.add(inventory.get(index));
//             System.out.printf("\n You just equipped %s \n",equipItem);
//             inventory.remove(equipItem);
//         }
//         else if (equipment.contains(equipItem))
//         {
//             System.out.printf("\n %s is already equpped\n",equipItem);
//         }
//         else
//         {
//            System.out.println("There is no such item to equip"); 
//         }
    }
    
    
    
}
    
