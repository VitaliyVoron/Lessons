package ua.itea.homework03;

public class ShopSwitch {

	public static void main(String[] args) {
		int amount = 399;
		int discount = 0;
		int discountSum = 0;
		switch (amount / 100) {
		case 0:
		case 1:
		case 2:
			discount = 0;
			break;
		case 3:
			discount = 3;
			break;
		case 4:
			discount = 5;
			break;
		default:
			discount = 7;
			break;
		}
		discountSum = amount * discount / 100;
		amount = amount - discountSum;
		System.out.println("You have " + discount + "% discount = -" + discountSum);
		System.out.println("Your purchase amount = " + amount);

	}

}
