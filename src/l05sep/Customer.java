package l05sep;

public class Customer {
	Cart cart;
	void addCart(Cart cart){
		this.cart=cart;
	}
	void addProduct(Product product){
		cart.addToCart(product);
	}
}
