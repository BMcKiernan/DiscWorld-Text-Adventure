
/**
 * The LockedRoom class is a special case of Room, where the player
 * needs an item in their inventory to be able to enter.  It contains
 * a String of the item name to unlock it
 * 
 * 
 * @author Brian McKiernan
 * @Nathan Paget
 * @version 11/14/26
 */
public class LockedRoom extends Room
{
    // instance variables - replace the example below with your own
    private String keyName;

    /**
     * Constructor for objects of class LockedRoom
     */
    public LockedRoom(String description, String roomName, String key)
    {
        super(description,roomName);
        this.keyName=key;
    }
    /**
     * @return a String of the required item name
     */
    public String getKeyName() {
        return keyName;
    }
}
