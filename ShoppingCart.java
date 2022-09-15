/**
 * 
 */

/**
 * @author mjric
 *
 */
public class ShoppingCart<T> implements ShoppingCartInterface<T> {
	//Instantiated variables
	private T[] bag;
	private ResizableArrayBag cartBag;
	
	/**
	 * Default Constructor for Shopping Cart 
	 */
	public ShoppingCart() {
		cartBag=new ResizableArrayBag();
	}
	/**
	 * Constructor for Shopping Cart that allows for entering the size of the cart
	 * @param sizeOfArray the desired size that the user wants the shopping cart to be
	 */
	public ShoppingCart(int sizeOfArray) {
		cartBag=new ResizableArrayBag(sizeOfArray);
	}
	
	/**
	 * Adds a specified item to the shopping cart
	 * @return true if the adding is successful and false if not
	 * @param entry the item to be added to the cart
	 */
	
	public boolean addItem(Item entry) {
		return cartBag.add(entry);
	}
	/**
	 * Removes an unspecified item from the shopping cart
	 * @return the item that was removed if successful, or null if it failed
	 */
	public T remove() {
		return (T) cartBag.remove();
	}
	
	/**
	 * Removes one occurrence of a specified item
	 * @return true if the item is removed, false if the removing is unsuccessful
	 * @param entry the item that is going to be removed
	 */
	public boolean removeItem(Item entry) {
		return cartBag.remove(entry);
	}
	/**
	 * Gets the current amount of items within the shopping cart
	 * @return int value of the amount of items in the cart
	 */
	public int getCurrentSize() {
		return cartBag.getCurrentSize();
	}
	/**
	 * Checks to see if the shopping cart is full
	 * @return true if the cart is full and false if it is not full
	 */
	public boolean isFull() {
		return cartBag.isArrayFull();
	}
	/**
	 * Checks to see if the shopping cart is empty
	 * @return true if the cart is empty and false it is not empty
	 */
	public boolean isEmpty() {
		return cartBag.isEmpty();
	}
	/**
	 * Gets the amount of times a given item appears in the cart
	 * @return int value of how many times a specific item appears in the cart
	 * @param entry the item that will be searched for
	 */
	public int getFrequencyOf(Item entry) {
		return cartBag.getFrequencyOf(entry);
	}
	/**
	 * Clears every entry within the cart
	 * @return void
	 */
	public void clear() {
		cartBag.clear();
	}
	/**
	 * Adds up the total price of the items within the cart
	 * @return double value of the total price of the items within the cart
	 */
	public double totalPrice() {
		Object [] localCart= cartBag.toArray();
		double sum=0;
		
		for(int index=0;index<localCart.length;index++) {
			Item i= (Item) localCart[index];
				sum= sum + i.getPrice();	
		}
		  
		return sum;
		
	}
	/**
	 * Checks to see if the cart contains a specified item
	 * @return true if the cart contains a specified item and false if the cart does not contain the item
	 * @param entry the item that will be checked to see if it is in the cart
	 */
	public boolean contains(Item entry) {
		return cartBag.contains(entry);
	}
	/**
	 * Returns all of the entries in the cart in the form of an array
	 * @returns the entries in the cart in an array of type T
	 */
	public Object toArray() {
		return cartBag.toArray();
	}
	/**
	 * prints the items within the cart with their names and prices and also prints the current size of the cart
	 */
	public void printCart() {
		Object [] localCart=cartBag.toArray();
		
		for (int index=0;index<localCart.length;index++) {
			Item i=(Item) localCart[index];
			System.out.println("Name: "+i.getName()+" Price: "+i.getPrice());
		}
		System.out.println("Current Size: "+ cartBag.getCurrentSize());//prints current size
		
		
		
	}
}// close ShoppingCartInterface


