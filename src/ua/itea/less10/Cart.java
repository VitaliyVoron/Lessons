package ua.itea.less10;

public class Cart {

	Product[] products = new Product[5];

	public Cart() {
	}

	void getProducts() {
		for (int i = 0; i < products.length; i++){
			if(products[i]==null) continue;
			products[i].getInfo();
		}
	}

	void deleteProduct(int num) {
		products[num] = null;
	}
	
	void addProduct(Product product){
		for (int i = 0; i < products.length; i++) {
			if(products[i]==null){
				products[i] = product;
				break;
			}
		}
	}

}
