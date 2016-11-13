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
    public RoomWithDeathChance(String description, int percentChanceOfDeath, String safeItem)
    {
        super(description);
        this.percentChanceOfDeath=percentChanceOfDeath;
        this.safeItem=safeItem;
        rand = new Random();
    }
    public boolean isDead(Inventory playerInv)
    {
        if 
    }
    private boolean checkDeathEvent()
    {
        int  n = rand.nextInt(100) + 1;
        return n<percentChanceOfDeath;
    }

 
}
