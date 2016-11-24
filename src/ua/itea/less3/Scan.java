package ua.itea.less3;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		int sumNum=0;
		Scanner in;
		in = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=in.nextInt();
		System.out.println("Enter num2:");
		int num2=in.nextInt();
		while(num1!=num2){
			if(num1%2==0){
				sumNum+=num1;
			}
			num1++;
		}
		System.out.println(sumNum);
		in.close();
		
		System.out.println((int)(Math.random()*100));
		

	}

}
