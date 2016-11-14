import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
/**
 * This is a special case of the Room class which has a % chance of
 * killing the player unless they have a specific item equipped.
 * the % chance of death is in the range 0-100
 * 
 * @author Brian McKiernan
 * @Nathan Paget
 * @version 11/14/26
 */
public class RoomWithDeathChance extends Room
{
    private int percentChanceOfDeath;
    private String safeItem;
    private Random rand;
    /**
     * Constructor for objects of class RoomWithFloors
     */
    public RoomWithDeathChance(String description, String roomName, int percentChanceOfDeath, String safeItem)
    {
        super(description,roomName);
        this.percentChanceOfDeath=percentChanceOfDeath;
        this.safeItem=safeItem;
        rand = new Random();
    }

    /**
     * method to check if the player will die once they enter the room
     * @return boolean of dead/alive
     * 
     */
    public boolean isDead(Inventory playerEquipment)
    {
        
        if(playerEquipment.stringFindsItem(safeItem)==null){
            return checkDeathEvent();
        }
        else {
            Item item =playerEquipment.stringFindsItem(safeItem);

            
            if(item.isItemEquipped(item)) {
                return false;            
            }
            else{
                return checkDeathEvent();
            }
        }
    }

    /**
     * method to check whether the death event actually occurs
     * @return true/false of event occurring
     */

    private boolean checkDeathEvent()
    {
        int  n = rand.nextInt(100) + 1;
        System.out.println(""+n+" > "+percentChanceOfDeath+"?");
        return n<percentChanceOfDeath;
    }
}
