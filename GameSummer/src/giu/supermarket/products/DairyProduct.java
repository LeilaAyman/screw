package giu.supermarket.products;

public class DairyProduct extends GroceryProduct {
	
	private Fat fat;

	public DairyProduct(String name, double price, double discount,Fat fat ) {
		super(name, price, discount);
		this.fat=fat;
	}

//	@Override
//	public double getActualPrice() {
//		// TODO Auto-generated method stub
//		return super.getActualPrice();
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n"+"Fat Level: "+fat;          
	}

	public Fat getFat() {
		return fat;
	}

	public void setFat(Fat fat) {
		this.fat = fat;
	}

	
}
