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
    private int maxFloors;
    private int currentFloor;
    /**
     * Constructor for objects of class RoomWithFloors
     */
    public RoomWithFloors(String description, int maxFloors)
    {
        super(description);
        this.maxFloors=maxFloors;
        currentFloor=1;
    }
    public int getMaxFloors() {
        return maxFloors;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public boolean goUp(){
        if(currentFloor<maxFloors){
            currentFloor++;
            return true;
        }
        else {
            return false;
        }
            
    }
    public boolean goDown(){
        if(currentFloor>1){
            currentFloor--;
            return true;
        }
        else {
            return false;
        }
            
    }
    public boolean moveFloors(String direction){
        if(direction.equals("up")){
            return goUp();
        }
        else if(direction.equals("down")) {
            return goDown();
        }
        else{
            return false;
        }
    }
 
}
