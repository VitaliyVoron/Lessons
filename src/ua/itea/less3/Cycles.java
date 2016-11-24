package ua.itea.less3;

public class Cycles {

	public static void main(String[] args) {
		int evenNum = 0;
		int notEvenNum = 0;
		int sumNum = 0;
		int num = 53861;
		//int temp = 0;
		
		while (num!=0) {
			int temp = num%10;
			sumNum+=temp;
			num/=10;
			if((temp%2)==0){
				evenNum++;
			} else{
				notEvenNum++;
			}
			
		}
		System.out.println("Even -" + evenNum);
		System.out.println("not even -" + notEvenNum);
		System.out.println("sum number -" + sumNum);
		
		

	}

}
