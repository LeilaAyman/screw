package giu.supermarket.products;

public class GroceryProduct {
	private String name;
	private double price;
	private double discount;
   public GroceryProduct(String name, double price, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
   final public  double  getActualPrice() {
		double actualprice;
		actualprice=price-(price*discount/100);
		return actualprice;
	}
	@Override
	public String toString() {
		return "Name: " + name +"\n"+ "Price: " + price+ "L.E."+ "\n" +" Discount: " + discount + "%" ;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getDiscount() {
		return discount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
}
