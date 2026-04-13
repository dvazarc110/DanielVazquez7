package test;

import java.util.List;

public class Customer {

	private String name;
	private int age;
	private List<Purchase> purchase;
	
	public Customer(String name, int age, List<Purchase> purchase) {
		this.name = name;
		this.age = age;
		this.purchase = purchase;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public List<Purchase> getPurchase() {
		return purchase;
	}
	@Override
	public String toString() {
		String s = String.format("Nombre: %s, Edad: %d\nCompras: \n", name, age);
		for(Purchase p : purchase) {
			s = s.concat(String.format("%s", p.toString()));
		}
		return s;
	}
}