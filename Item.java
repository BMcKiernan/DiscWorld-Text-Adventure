
/**
 * This is an item class and will help determine the actions that can be implemented with an item.
 * 
 * @author Brian McKiernan
 * @Nathan Paget
 * @version 11/14/26
 */
public class Item
{
   boolean equipable;
   String itemName;
   boolean isEquipped;
   int weight;
   /**
    * Constructor that accepts arguments for Item.
    */
   public Item(String itemName, boolean equipable){
       this.itemName = itemName;
       this.equipable = equipable;
       isEquipped=false;
       weight=2;
    }
    
   /**
    * Method return the name of the Item. Can test a string the user enters to see if it matches the name of an
    * Item.
    */ 
   public String getName()
   {
       return itemName;
   }
   
    /**

     * equip Method returns a boolean about whether or not an item is equipable.
     */
   private boolean isItemEquipable(){
      return equipable;
   }
   
   /**
    * This method checks to see if an Item is equipped.
    */
   public boolean isItemEquipped(){
       return isEquipped;
   }
   
   /**
    * Method equips Item passed to the method if it is equipable.
    */
   public void equipItem(Item itemToEquip){
       boolean trueOrFalse = itemToEquip.isItemEquipable();
       if(trueOrFalse == true)
       {
           isEquipped = true;
           System.out.println("The "+itemToEquip.getName()+" is now equipped");
       }
       else
           System.out.println("You cannot equip item: "+itemToEquip.getName());
    }
    
   public void unequip(){
       if(isItemEquipped() ){
           isEquipped = false;
       }
    }
}
