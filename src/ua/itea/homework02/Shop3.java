package ua.itea.homework02;

public class Shop3 {

	public static void main(String[] args) {
		int discount=0;
		double amount=13500;
		double discountSum=0;
		amount=cutExcessFraction(amount);
		discount=setDiscount(amount);
		discountSum=calculateDiscountSum(amount,discount);
		System.out.println("Your discount = -"+discountSum);
		System.out.println("Your purchase amount = "+amount);
	}

	private static int setDiscount(double amount) {
		int discount=0;
		if(amount<0){
			System.out.println("Enter the correct sum!");
		} else if(amount >= 300 && amount < 400) {
			discount=3;
		} else if(amount >= 400 && amount < 500) {
			discount=5;
		} else if(amount >= 500) {
			discount=7;
		}
		return discount;
	}

	private static double calculateDiscountSum(double amount, int discount) {
		double discountSum;
		discountSum=amount*discount/100;
		return discountSum;
	}

	private static double cutExcessFraction(double sum) {
		sum=sum*100;
		double fraction=sum%1;
		sum=sum-fraction;
		sum=sum/100;
		return sum;
	}

}
