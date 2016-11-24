package ua.itea.less10;

public class MainProduct {

	public static void main(String[] args) {
		Cart cart = new Cart();
		Customer cus = new Customer("Petya");
		Customer cus2 = new Customer("Vasya");
		
		Product prod1 = new Product("Bear", "testy", 20);
		Product prod2 = new Product("Bear1", "testy", 27);
		Product prod3 = new Product("Bear2", "testy", 25);
		cus.takeCart(cart);
		cus.addProductToCart(prod1);
		cus.addProductToCart(prod2);
		cus.addProductToCart(prod3);
		cus.addProductToCart(prod1);
		cus.addProductToCart(prod2);
		cus.showCart();
		System.out.println("================");
		cus2.takeCart(cus.giveCart());
		cus.showCart();
		System.out.println("================");
		cus2.showCart();
		System.out.println("================");
		cus2.deleteProduct(3);
		cus2.showCart();
		System.out.println("================");
		cus.takeCart(cus2.giveCart());
		cus2.showCart();
		cus.showCart();
		
		//cus.showCart();
		//System.out.println("=======");
		//cus.deleteProduct(4);
		//cus.showCart();

	}

}
