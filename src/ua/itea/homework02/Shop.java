package ua.itea.homework02;

public class Shop {

	public static void main(String[] args) {
		int discount=0;
		double sumBuy=300;
		double discountSum=0;
		//sumBuy=(int)(sumBuy*100);  //cut excess fraction
		//sumBuy=sumBuy/100;
		double excessFraction=(discountSum*100)%1;		  //calculate excess fraction
		discountSum=(discountSum*100-excessFraction)/100; //cut excess fraction
		sumBuy=sumBuy-discountSum;						  //calculate the amount with discount
		sumBuy=(int)(sumBuy*100);  						  //cut excess fraction
		sumBuy=sumBuy/100;
		
		if(sumBuy<0){
			System.out.println("Enter the correct sum!");
			
		} else if(sumBuy >= 300 && sumBuy < 400) {
			discount=3;
			discountSum=sumBuy*discount/100;                         //calculate the amount of discount
			
		} else if(sumBuy >= 400 && sumBuy < 500) {
			discount=5;
			discountSum=sumBuy*discount/100;                         
			
		} else if(sumBuy >= 500) {
			discount=7;
			discountSum=sumBuy*discount/100;                         
		} 
		
		System.out.println("You have "+ discount +"% discount = -"+discountSum);
		System.out.println("Your purchase amount = "+sumBuy);
		
		

	}

}
