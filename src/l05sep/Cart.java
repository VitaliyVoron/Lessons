package l05sep;

public class Cart {
	Product[] products=new Product[5];
	void addToCart(Product product){
		int i=0;
		while(i<products.length){
			if(products[i]==null){
				products[i]=product;
				break;
			}
			i++;
		}
	}
	void showCart(){
		for(Product p: products){
			if(p!=null)System.out.println(p.getName());
		}
	}
}
