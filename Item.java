package AdventureGame;

public class Item extends Identifiable 
{
	
	/**
	 * Access the description
	 * @return - The item's description
	 */
	public String description()
	{
		return description;
	} /* end description() */
	
	/**
	 * Access the name
	 * @return - The item's name
	 */
	public String name()
	{
		return name;
	} /* end name() */
	
	private String description;
	private String name;

} /* end Item */
