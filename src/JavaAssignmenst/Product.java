package JavaAssignmenst;

public class Product  {

	
	int productId; 
	String productName;
	double price;
	int quantity;
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public double calculateTotalCost() {
		
		double total_Cost = price*quantity;
		return total_Cost;
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}