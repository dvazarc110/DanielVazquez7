package test;

public class Purchase {

	private String product;
	private int amount;
	public Purchase(String product, int amount) {
		this.product = product;
		this.amount = amount;
	}
	public String getProduct() {
		return product;
	}
	public int getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return String.format("\tProducto: %s Cantidad: %d\n", product, amount);
	}
}