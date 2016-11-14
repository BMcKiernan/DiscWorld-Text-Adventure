import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
  
 * @author Brian McKiernan
 * @Nathan Paget
 * @version 11/14/26
 */

public class Room 
{
    private String description;
    private HashMap<String, Room> exits;        // stores exits of this room.
    private Inventory contents;
    private String roomName;
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description, String roomName) 
    {
        this.description = description;
        this.roomName=roomName;
        exits = new HashMap<>();
        contents = new Inventory();
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }
    /**
     * @return String name of room
     */
    public String getRoomName()
    {
        return roomName;
    }
    
    /**
     * returns the size of the contents array.
     */
    public int contentsSize(){
        int size = contents.size();
        return size;
    }
    
    /**
     * Returns a boolean if the contents array contains the item.
     */
    public boolean contains(Item item){
        return contents.contains(item);
    }
    
    /**
     * This method adds items to a rooms contents the first time they are created.
     */
    public void addItemInitial(String itemname, boolean equipable)
    {
        Item item = new Item(itemname,equipable);
        contents.addItem(item);
    }
    
    /**
     * This method adds already created Items to the rooms contents array.
     * 
     */
    public void addItem(Item item){
        contents.addItem(item);
    }
    
    /**
     *Calls the method from inventory to remove an Item.
     */
    public void removeItem(Item itemName){
           contents.removeItem(itemName);
    }
    
    /**
     * This method returns an item found from its string name. The item is not automatically
     * removed the the contents array.
     */
    public Item getItem(String itemName){
        Item item = contents.stringFindsItem(itemName);
        return item;
    }
    
    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n You can see: " +getContents()+ "\n"+ getExitString() + "\n";
    }
    
    /**
     * @return The contents of the room as comma delimited String
     */
    public String getContents()
    {
        String contentString ="";
        for(int i = 0; i<contents.size(); i++)
        {
            Item itemForString; 
            itemForString = contents.getItem(i);
            String itemName = itemForString.getName();
            contentString += ("a(n) "+itemName+", ");
        }
        return contentString;
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }
}

