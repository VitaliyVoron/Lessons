package l05sep;

public class CartM {

	public static void main(String[] args) {
		Cart cart=new Cart();
		Customer customer=new Customer();
		customer.addCart(cart);
		customer.addProduct(new Product("Fanta"));
		//customer.cart.addToCart(new Product("Guiness"));
		//customer.cart.showCart();
	}

}
