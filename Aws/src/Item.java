import java.util.ArrayList;

public class Item{
	private String itemName;
	private float price;
	private float quantity;

	public String getItemName(){
		return itemName;
	}
	public float getPrice(){
		return price;
	}
	public float getQuantity(){
		return quantity;
	}
	

	public Item(String itemName, float price, float quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public static void main(String[] args) {
		ArrayList<Item> arr = new ArrayList<Item>();
		arr.add(new Item("Book",120.5f,77));
		arr.add(new Item("Book",60.8f,61));
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));

	}
}