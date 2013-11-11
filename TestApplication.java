package AdventureGameTestApp;

/**
 * BIG QUESTION:	
 * How does this class communicate with the class "InitializeApplication.java"?
 * I know that they are in the same class and everything, but how does
 * InitializeApplication's run method actually get executed when this class's 
 * run method gets executed?
 */
 
 // TODO: Test the Item in Location concept for look()

import AdventureGame.*; 
// I think that this^ imports all classes in AdventureGame

/**
 * This is the test application for an adventure game.  It is a Singleton.
 */
public class Application extends AdventureGame.Application
{
	/**
	 * The driver for the program
	 * @param args
	 */
   public static void main(String[] args) throws ApplicationAlreadyExistsException
   {
   	Application instance = new Application();
   	instance.run();   	
   } /* end main */

   /**
    * A constructor for the class
    * @throws ApplicationAlreadyExistsException
    */
   protected Application() throws ApplicationAlreadyExistsException
   {
   } /* end Application */
   
   /**
    * The tasks of the application are performed here.
    */
   public void run()
   {
   	loadLocations();
   	loadMap();
   	
   	System.out.print("look: ");
   	look();
   	
   	System.out.print("go east: ");
   	movePlayerEast();

   	System.out.print("go north: ");
   	movePlayerNorth();

   	System.out.print("go south: ");
   	movePlayerSouth();

   	System.out.print("go west: ");
   	movePlayerWest();

   	System.out.print("go north: ");
   	movePlayerNorth();

   	System.out.print("go west: ");
   	movePlayerWest();

   	System.out.println("Done");
   } /* end run */
   

   // TODO : Delete me
   private void loadLocations()
   {
   	loadLocationsFromFileNamed("locations.dat");   	
   } /* end loadLocations */

   // TODO : Delete me
   private void loadMap()
   {
   	loadMapFromFileNamed("map.dat");   	
   } /* end loadMap */

} /* end Application */

