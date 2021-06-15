package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> pList = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products:"); int n = sc.nextInt();
		
		for(int i=1; i <= n;i++) {
			
			System.out.println("Product #"+i+" data:");
			System.out.print("common,used or imported(c/u/i): "); char productType = sc.next().charAt(0);
			
			if(productType == 'c') {
				System.out.print("Name: "); String name = sc.next();
				System.out.print("Price: "); double price = sc.nextDouble();
				pList.add(new Product(name,price));
			}else if(productType == 'u') {
				System.out.print("Name: "); String name = sc.next();
				System.out.print("Price: "); double price = sc.nextDouble();
				System.out.print("Date: "); Date date = sdf.parse(sc.next());
				pList.add(new UsedProduct(name,price,date));
			}else if(productType == 'i') {
				System.out.print("Name: "); String name = sc.next();
				System.out.print("Price: "); double price = sc.nextDouble();
				System.out.print("Customs fee: "); double customsFee = sc.nextDouble();
				pList.add(new ImportedProduct(name,price,customsFee));
			}
		}
		
		System.out.println("Price tags: ");
		for(Product p: pList) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
