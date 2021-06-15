package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	Date manufactureDate = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


	public UsedProduct(String name, double price, Date date) {
		super(name, price);
		manufactureDate = date;
	}
	
	@Override
	public String priceTag() {
		return name+"(used) $ "+price+" (Manufacture date: "+sdf.format(manufactureDate)+")";
	}
}
