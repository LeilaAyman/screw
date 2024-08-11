package giu.supermarket.products;


public class Beverage extends GroceryProduct {
	 private SugarLevel sugarLevel;

	public Beverage(String name, double price, double discount,SugarLevel sugarLevel ) {
		super(name, price, discount);
		this.sugarLevel=sugarLevel;
	}

//	@Override
//	public double getActualPrice() {
//		// TODO Auto-generated method stub
//		return super.getActualPrice();
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"+"Sugar Level: "+sugarLevel;
	}

	public SugarLevel getSugarLevel() {
		return sugarLevel;
	}

	public void setSugarLevel(SugarLevel sugarLevel) {
		this.sugarLevel = sugarLevel;
	}
	

}
