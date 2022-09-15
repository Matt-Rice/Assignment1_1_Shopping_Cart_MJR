 
/**
 * Interface for the item class
 * @author Matt Rice
 * @version 09/08/2022
 */
public interface ItemInterface<T> {
	/**
	 * Sets the name of the item
	 * @return void
	 * @param name the name of the item
	 */
	public void setName(String name);
	/**
	 * gets the name of an item
	 * @return the name of the specified item
	 */
	public String getName();
	/**
	 * sets the price of an item
	 * @return void
	 * @param price the price of a specified item
	 */
	public void setPrice(double price);
	/**
	 * gets the price of the item
	 * @return the price of the specified item
	 */
	public double getPrice();
}//end ItemInterface
