package test;

import java.util.List;

public class Main {
	Database db = new Database();
	
	public void show() {
		db.addCustomer(new Customer("Juan", 56, List.of(new Purchase("Pipas", 8), new Purchase("Lechuga", 2), new Purchase("Leche", 6))));
		db.addCustomer(new Customer("Roberto", 45, List.of(new Purchase("Arroz", 2))));
		db.addCustomer(new Customer("Luis", 21, List.of(new Purchase("Garbanzos", 2), new Purchase("Pipas", 5), new Purchase("Arroz", 1))));
		db.addCustomer(new Customer("Ana", 35, List.of(new Purchase("Leche", 3), new Purchase("Pipas", 8))));
		db.addCustomer(new Customer("Lidia", 18, List.of(new Purchase("Lechuga", 1), new Purchase("Garbanzos", 1))));
		db.addCustomer(new Customer("Rosa", 27, List.of(new Purchase("Arroz", 2), new Purchase("Lechuga", 3), new Purchase("Leche", 3), new Purchase("Garbanzos", 4), new Purchase("Pipas", 5))));
		db.queryAllCustomer().forEach(System.out::println);
	}

	public static void main(String[] args) {
		new Main().show();
	}
}
