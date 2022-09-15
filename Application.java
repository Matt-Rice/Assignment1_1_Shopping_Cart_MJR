/**
 * 
 */

/**
 * Class to test ShoppingCart Methods
 * @author mjrice
 * @version 09/15/22
 *Application.java
 */
import java.text.DecimalFormat;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates a shopping cart with a size of 20
		ShoppingCart cart= new ShoppingCart(20);
		
		//Creating and adding items to the cart
		Item cookie=new Item("cookie",2.50);
			cart.addItem(cookie);
			
		Item orange=new Item("orange", 102.30);
			cart.addItem(orange);
			cart.addItem(orange);
			cart.addItem(orange);
			cart.addItem(orange);
		
		Item apple=new Item("apple", 5.23);
			cart.addItem(apple);
			cart.addItem(apple);
		
		Item cord=new Item("cord",4.51);
			cart.addItem(cord);
			
		Item jam=new Item("jam",2.50);
			cart.addItem(jam);
			cart.addItem(jam);
			cart.addItem(jam);
		
		//Prints the items that have been added to the cart
		cart.printCart();
		//Sets a decimal format
		DecimalFormat ft= new DecimalFormat("####");
		ft = new DecimalFormat("$###,###.###");
		
		//Tests the totalPrice() method
		System.out.println("The current total price of the items in the cart are: "+ ft.format(cart.totalPrice()));
		//Tests the contains(Item entry) method
		System.out.println("Does the cart contain an orange?: "+ cart.contains(orange));
		//Tests getFrequencyOf(Item entry) method
		System.out.println("How many apples are in the cart?: "+ cart.getFrequencyOf(apple));
		//Tests isFull() method
		System.out.println("Is the cart full? : "+cart.isFull());
		
		//Removing five items from within the cart
		cart.remove();
		cart.removeItem(cookie);
		cart.removeItem(orange);
		cart.removeItem(apple);
		cart.removeItem(orange);
		//Prints contents and size of the cart after removing five items
		System.out.println("Here is the contents of the cart after removing five items: ");
			cart.printCart();
		//Current price after removing
		System.out.println("Total price after removing "+ ft.format(cart.totalPrice()));
		
		//Tests the clear() method	
		cart.clear();
		System.out.println("Current size of the cart after clearing: "+ cart.getCurrentSize());
		//Tests the isEmpty() method
		System.out.println("Is the cart empty?: "+ cart.isEmpty());
	
	
	
	
	
	}

}
