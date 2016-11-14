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
     * Adds an item to the players inventory.
     */
    public void addItem(Item item){
        playerInventory.addItem(item);
    }
    
    /**
    * Removes an Item from the players inventory.
    */
    public void remove(Item item){
        playerInventory.removeItem(item);
    }
    
    /**
     * Checks to see if the player's inventory contains the item.
     */
    public boolean contains(Item item){
        return playerInventory.contains(item);
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
    
    /**
     * equipItem method passes a string to the inventory array. After the inventory array verifies it has the
     * item it then passes it to the equipment array 
     */
    public void equipItem(Item itemToEquip)
    {
        if(playerInventory.contains(itemToEquip))
        {
            itemToEquip.equipItem(itemToEquip);
            String itemName = itemToEquip.getName();
            Item itemForTransfer = playerInventory.stringFindsItem(itemName);
            playerInventory.removeItem(itemForTransfer);
            equipment.addItem(itemForTransfer);
        }  
        else
        {
           System.out.println("There is no such item to equip"); 
        }
    }
    
    /**
     * If an item is equipped and it is passed to the unEquip method, this method searches the equipment array
     * for the item it then sets that items isEquipped boolean to false, removes the item from the equip array
     * and adds it back to the players inventory. If the item is not equipped this method returns a print statement.
     */
    public void unEquip(String itemToUnequipString){
        Item itemToUnequip = equipment.stringFindsItem(itemToUnequipString);
        if(itemToUnequip.isItemEquipped(itemToUnequip)==true){
            itemToUnequip.unEquip(itemToUnequip);
            equipment.removeItem(itemToUnequip);
            playerInventory.addItem(itemToUnequip);
            System.out.println("The "+itemToUnequip+" has been unequipped and is back in your inventory");
        }
        else{
            System.out.println("The "+itemToUnequip+" was not equipped and therefore you can't unequip it.");
        }
    }
    
        public void equipItemFromString(String itemToEquipString)
    {
        Item itemToEquip=playerInventory.stringFindsItem(itemToEquipString);
        if(itemToEquip!=null)
        {
            itemToEquip.equipItem(itemToEquip);
            String itemName = itemToEquip.getName();
            Item itemForTransfer = playerInventory.stringFindsItem(itemName);
            playerInventory.removeItem(itemForTransfer);
            equipment.addItem(itemForTransfer);
        }  
        else
        {
           System.out.println("There is no such item to equip"); 
        }
    }
}
    
