import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
/**
 * Write a description of class RoomWithFloors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public boolean isDead(Inventory playerInv)
    {
        if(playerInv.stringFindsItem(safeItem)==null){
            return checkDeathEvent();
        }
        else {
            Item item = playerInv.stringFindsItem(safeItem);
            
            if(item.isItemEquipped(item)) {
                return false;            
            }
            else{
                return false;
            }
        }
    }
    
    private boolean checkDeathEvent()
    {
        int  n = rand.nextInt(100) + 1;
        System.out.println(""+n+" > "+percentChanceOfDeath+"?");
        return n<percentChanceOfDeath;
    }
}
