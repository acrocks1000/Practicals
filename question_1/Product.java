package question_1;

public class Product {
	String productID, productName;
	float price;
	int quantity;

	// Constructor to enter the values to the instance variables
	public Product(String productID, String productName, float price, int quantity) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	// Getter methods for each instance variable
	
	public String getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public float getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
}
