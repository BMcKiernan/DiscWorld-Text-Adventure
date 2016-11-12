
/**
 * This is an item class and will help determine the actions that can be implemented with an item.
 * 
 * @author Brian McKiernan Nathan Paget
 * @version 11/11/2016
 */
public class Item
{
   boolean equipable;
   String itemName;
   
   /**
    * Constructor that accepts arguments for Item.
    */
   public Item(String itemName, boolean equipable){
       this.itemName = itemName;
       this.equipable = equipable;
    }
    
   /**
    * Method return the name of the Item.
    */ 
   public String getName()
   {
       return itemName;
   }
    
    /**

     * equip Method returns a boolean about whether or not an item is equipable.
     */
   public boolean equip(){
       if(equipable == true)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}
