import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
/**
 * RoomWithFloors is a special case of Room where rather than moving to an adjacent 
 * room, the movement is tracked within the object to reduce the number of separate rooms
 * required (and to see how subclasses work)
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
    /**
     * @return int number of floors in the room
     */
    public int getMaxFloors() {
        return maxFloors;
    }
    /**
     * @return int value of current floor
     */
    public int getCurrentFloor() {
        return currentFloor;
    }
    /**
     * Checks to see that the current floor is within the proper bounds 
     * to be able to go up
     * @return boolean of success/fail
     */
    public boolean goUp(){
        if(currentFloor<maxFloors){
            currentFloor++;
            return true;
        }
        else {
            return false;
        }
            
    }
    /**
     * Checks to see that the current floor is within the proper bounds 
     * to be able to go down
     * @return boolean of success/fail
     */
    public boolean goDown(){
        if(currentFloor>1){
            currentFloor--;
            return true;
        }
        else {
            return false;
        }
            
    }
    /**
     * method to move floors within the room, takes a String as the argument,
     * ignores anything other than up or down, increments or decrements the 
     * current floor number, then returns a boolean of success/fail
     */
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
