package ua.itea.less10;

public class Customer {

	Cart cart;
	String name;

	public Customer(String name) {
		this.name = name;
	}

	void addProductToCart(Product product) {
		cart.addProduct(product);
	}

	void deleteProduct(int num) {
		cart.deleteProduct(num);
	}

	void showCart() {
		if(cart != null){
			cart.getProducts();
		} else {
			System.out.println("You have not cart!!!");
		}
	}

	Cart giveCart() {
		if (cart != null) {
			Cart temp = cart;
			cart = null;
			return temp;
		}
		return null;
	}

	void takeCart(Cart cart) {
		if (this.cart == null) {
			this.cart = cart;
		}
	}

}
