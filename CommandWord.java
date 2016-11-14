/**
 * Representations for all the valid command words for the game
 * along with a string in a particular language.
 * 
 * @author Brian McKiernan
 * @Nathan Paget
 * @version 11/14/26
 */
public enum CommandWord
{
    // A value for each command word along with its
    // corresponding user interface string.

    GO("go"), QUIT("quit"), HELP("help"), LOOK("look"), UNKNOWN("?"), 
    BACK("back"), GIVE("give"), TAKE("take"), DROP("drop"), EQUIP("equip"), UNEQUIP("unequip");

    
    // The command string.
    private String commandString;
    
    /**
     * Initialise with the corresponding command string.
     * @param commandString The command string.
     */
    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }
    
    /**
     * @return The command word as a string.
     */
    public String toString()
    {
        return commandString;
    }
}
