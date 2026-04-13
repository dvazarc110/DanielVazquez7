package test;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private List<Customer> customers;
	
	public Database() {
		customers = new ArrayList<>();
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	public List<Customer> queryAllCustomer(){
		return customers;
	}
	
	public Customer getCustomer(int position){
		return customers.get(position);
	}
	
}