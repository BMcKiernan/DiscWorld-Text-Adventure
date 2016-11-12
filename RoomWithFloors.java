import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
/**
 * Write a description of class RoomWithFloors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoomWithFloors extends Room
{
    private int floors;
    /**
     * Constructor for objects of class RoomWithFloors
     */
    public RoomWithFloors(String description, int floors)
    {
        super(description);
        this.floors=floors;
    }

 
}
