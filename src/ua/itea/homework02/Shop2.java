package ua.itea.homework02;

public class Shop2 {

	public static void main(String[] args) {
		int amount=350;
		int discount=0;
		int discountSum=0;
		
		if (amount<0){
			System.out.println("Enter the correct sum!");
		} else if(amount >= 300 && amount < 400) {
			discount=3;
			amount=amount-discountSum;
		} else if(amount >= 400 && amount < 500) {
			discount=5;
			amount=amount-discountSum;
		} else if(amount >= 500) {
			discount=7;
			amount=amount-discountSum;
		}
		
		discountSum=amount*discount/100;
		
		System.out.println("You have "+ discount +"% discount = -"+discountSum);
		System.out.println("Your purchase amount = "+amount);
	}

}
