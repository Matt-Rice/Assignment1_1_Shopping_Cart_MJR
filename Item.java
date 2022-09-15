/**
 * 
 * @author mjric
 *
 * 
 */
public class Item<T> implements ItemInterface<T>{

	private String name;
	private double price;
	
	public Item() {
		name="Item";
		price=0.0;
	}
	public Item(String itemName,double itemPrice) {
		name=itemName;
		price=itemPrice;
	}
	public void setName(String Name) {
		name=Name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(double Price) {
		price=Price;
	}
	public double getPrice() {
		return price;
	}
}
