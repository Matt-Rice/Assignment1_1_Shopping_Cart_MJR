 
/**
 * An interface that defines the ADT Shopping Cart
 * @author Matt Rice
 * @version 1.0
 * 09/08/2022
 *
 */
public interface ShoppingCartInterface<T> {
	 
	/**
	 * Adds a specified item to the shopping cart
	 * @return true if the adding is successful and false if not
	 * @param entry the item to be added to the cart
	 */
	public boolean addItem(Item entry);
	/**
	 * Removes an unspecified item from the shopping cart
	 * @return the item that was removed if successful, or null if it failed
	 */
	public T remove();
	/**
	 * Removes one occurrence of a specified item
	 * @return true if the item is removed, false if the removing is unsuccessful
	 * @param entry the item that is going to be removed
	 */
	public boolean removeItem(Item entry);
	/**
	 * Gets the current amount of items within the shopping cart
	 * @return int value of the amount of items in the cart
	 */
	public int getCurrentSize();
	/**
	 * Checks to see if the shopping cart is full
	 * @return true if the cart is full and false if it is not full
	 */
	public boolean isFull();
	/**
	 * Checks to see if the shopping cart is empty
	 * @return true if the cart is empty and false it is not empty
	 */
	public boolean isEmpty();
	/**
	 * Gets the amount of times a given item appears in the cart
	 * @return int value of how many times a specific item appears in the cart
	 * @param entry the item that will be searched for
	 */
	public int getFrequencyOf(Item entry);
	/**
	 * Clears every entry within the cart
	 * @return void
	 */
	public void clear();
	/**
	 * Adds up the total price of the items within the cart
	 * @return double value of the total price of the items within the cart
	 */
	public double totalPrice();
	/**
	 * Checks to see if the cart contains a specified item
	 * @return true if the cart contains a specified item and false if the cart does not contain the item
	 * @param entry the item that will be checked to see if it is in the cart
	 */
	public boolean contains(Item entry);
	/**
	 * Returns all of the entries in the cart in the form of an array
	 * @returns the entries in the cart in an array of type T
	 */
	public Object toArray();
}// close ShoppingCartInterface
