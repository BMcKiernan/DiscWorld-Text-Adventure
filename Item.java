
/**
 * This is an item class and will help determine the actions that can be implemented with an item.
 * 
 * @author Brian McKiernan Nathan Paget
 * @version 11/11/2016
 */
public class Item
{
   boolean equipable ;
   boolean takeable;
   String itemName;
   
   /**
    * Constructor that accepts arguments for Item.
    */
   public Item(String itemName,boolean takeable, boolean equipable){
       this.itemName = itemName;
       this.takeable = takeable;
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
     * take method returns a boolean about whether or not an item is takeable.
     */
   public boolean take(){
       if(takeable == true)
       {
           return true;
       }
       else
       {
           return false;
       }
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
