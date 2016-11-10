/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room outside, theater, pub, lab, office, courtyard, libraryEntrance, libraryS, librarySE,
             libraryE, libraryNE, libraryN, libraryNW, libraryW, librarySW, libraryC, field, towerBase,
             towerMain, towerTop, mainEntrance, bathroom, greatHall, kitchen, cellar;
      
        // create the rooms

        courtyard = new Room("in the main courtyard of the Unseen University");
        
        libraryEntrance = new Room("in the entrance of the library.  You see the Librarian at his desk");
        libraryS = new Room("in the library.  You see towering bookshelves above you, and can hear the hum of magic in the air");
        librarySE = new Room("in the library.  You see towering bookshelves above you, and can hear the hum of magic in the air");
        libraryE = new Room("in the library.  You see towering bookshelves above you, and can hear the hum of magic in the air");
        libraryNE = new Room("in the library.  You see towering bookshelves above you, and can hear the hum of magic in the air");
        libraryN = new Room("in the library.  You see towering bookshelves above you, and can hear the hum of magic in the air");
        libraryNW = new Room("in the library.  You see towering bookshelves above you, and can hear the hum of magic in the air");
        libraryW = new Room("in the library.  You see towering bookshelves above you, and can hear the hum of magic in the air");
        librarySW = new Room("in the library.  You see towering bookshelves above you, and can hear the hum of magic in the air");
        libraryC = new Room("in the library.  You see towering bookshelves above you, and can hear the hum of magic in the air");
        
        field = new Room("in the main courtyard of the Unseen University");
        
        towerBase = new Room("in the base of the Tower of Art.  You see many flights of stairs above you");
        towerMain = new Room("somewhere on the staircase in the Tower of Art.  The stairs strech above and below you");
        towerTop = new Room("at the top of the Tower of Art. You have climbed all 8,888 stairs to get here");
        
        mainEntrance = new Room("in the entrance to the main building at the Unseen University");
        bathroom = new Room("in the Archchancellor's bathroom, built by Bloody Stupid Johnson");
        greatHall = new Room("in the Great Hall of the Unseen University.  Unfortunately, it isn't mealtime now");
        kitchen = new Room("in the Unseen University's kitchen");
        
        cellar = new Room("in the cellar below the kitchen. It is somewhat damp, and you see water on the floor from the east");
        // initialise room exits
        courtyard.setExit("south",field);
        courtyard.setExit("north",libraryEntrance);
        courtyard.setExit("east",towerBase);
        courtyard.setExit("west",mainEntrance);
        
        field.setExit("north",courtyard);
        
        mainEntrance.setExit("east",courtyard);
        mainEntrance.setExit("west",greatHall);
        mainEntrance.setExit("south",bathroom);
        
        greatHall.setExit("east",mainEntrance);
        greatHall.setExit("south",kitchen);
        
        bathroom.setExit("north",mainEntrance);
        
        kitchen.setExit("down",cellar);
        kitchen.setExit("north",greatHall);
        
        cellar.setExit("up",kitchen);
        
        towerBase.setExit("west",courtyard);
        
        libraryEntrance.setExit("south",courtyard);

        currentRoom = courtyard;  // start game outside
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type '" + CommandWord.HELP + "' if you need help.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();

        switch (commandWord) {
            case UNKNOWN:
                System.out.println("I don't know what you mean...");
                break;

            case HELP:
                printHelp();
                break;

            case GO:
                goRoom(command);
                break;

            case QUIT:
                wantToQuit = quit(command);
                break;

            case LOOK:
                look();
                break;
        }
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    /** 
     * Try to go in one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);
        Room prevRoom = currentRoom;

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }
    private void look()
    {
        System.out.println(currentRoom.getLongDescription());
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
}
