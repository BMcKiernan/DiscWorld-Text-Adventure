import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
/**
 * Write a description of class RoomWithFloors here.
 * 
 * @author Brian McKiernan
 * @Nathan Paget
 * @version 11/14/26
 */
public class RoomWithFloors extends Room
{
    private int maxFloors;
    private int currentFloor;
    /**
     * Constructor for objects of class RoomWithFloors
     */
    public RoomWithFloors(String description, String roomName, int maxFloors)
    {
        super(description,roomName);
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
