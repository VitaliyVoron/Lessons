package ua.itea.less5;

import java.util.Scanner;

public class Arr {
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	
	void getArr(){
		/*System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		System.out.println("g="+g);
		System.out.println("h="+h);*/
	}
	

	public static void main(String[] args) {
		//Arr arr = new Arr();
		//arr.getArr();
		//int[] a = new int[3];
		/*double[] a = new double[3];
		int[] b = {2,4,1,8};
		int[] c;
		System.out.println(a[1]);
		System.out.println(b[b.length-1]);
		c=b;
		c[1]=100;
		System.out.println(Arrays.toString(b));
		for(int i = 0; i < b.length; i++){
			System.out.println(b[i]);
		}*/
		
		/*double[] d = {3,6,5,3,9};
		double[] b = new double[d.length];
		int i = 0;
		while(i < d.length){
			b[i] = d[i];
			//System.out.println("b["+i+"]="+b[i]);
			i++;
		}
		
		char[] ch = {'-','*','-'};
		char[] ch2 = {'|','|','|','|','|','|','|'};
		System.arraycopy(ch, 0, ch2, ch2.length/2-1, ch.length);
		System.out.println(Arrays.toString(ch2));*/
		
		/*int[] a = {1,2,3};
		for(int c: a){
			System.out.println(c);
		}*/
		
		/*Scanner in;
		in = new Scanner(System.in);
		System.out.println("Enter number");
		int num = 0;
		if(in.hasNextInt()){
			num = in.nextInt();
		} else {
			System.out.println("You entered not a nomber");
		}
		int[] a = new int[num];
		int i = 0;
		while(i < a.length){
			System.out.println("Enter number");
			a[i] = in.nextInt();
			i++;
		}
		in.close();
		for(int c: a){
			System.out.println(c);
		}*/
		
		Scanner in;
		in = new Scanner(System.in);
		String login = "ali";
		String password = "1234";
		System.out.println("Enter password and login:");
		String ss = in.nextLine();
		String[] ssArr = ss.split(" ");
		if(ssArr.length == 2 && login.equals(ssArr[0]) && password.equals(ssArr[1])){
			System.out.println("OK");
		} else {
			System.out.println("Problem");
		}
		in.close();
		
	}

}
