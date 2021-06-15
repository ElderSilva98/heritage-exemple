package entities;

public class ImportedProduct extends Product{

	protected double customsFee;
	
	public ImportedProduct(String name, double price,double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price+customsFee;
	}
	
	@Override
	public String priceTag(){
		return name+" $ "+totalPrice()+" (Customs fee: " +customsFee+")";
	}
	
}
