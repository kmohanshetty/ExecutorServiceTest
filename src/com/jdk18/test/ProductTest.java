package com.jdk18.test;

import java.util.Arrays;
import java.util.List;

class Product {
	String name;
	int qty;
	
	@Override
	public String toString() {
		return name;
	}

	public Product(String name, int qty) {
		super();
		this.name = name;
		this.qty = qty;
	}
	
	static class ProductFilter {
		public boolean isAvailable(Product p) { //Line n1 //add static keyword to method
			return p.qty >= 10;
		}
	}
}

public class ProductTest {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
				new Product("MotherBoard", 5),
				new Product("Speaker", 20)
				);
		products.stream().filter(Product.ProductFilter::isAvailable).//line n2
		forEach(p -> System.out.println(p));
	}

}
