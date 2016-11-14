
/**
 * Write a description of class LockedRoom here.
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
    public String getKeyName() {
        return keyName;
    }
}
