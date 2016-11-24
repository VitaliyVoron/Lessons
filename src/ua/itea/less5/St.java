package ua.itea.less5;

import java.util.Scanner;

public class St {

	public static void main(String[] args) {
		//String str = "1";
		/*for(int i = 0; i <=100;i++){
			str+=1;
		}
		System.out.println();*/
		
		/*StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("123456789012345678901234567890123");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("12");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.trimToSize();
		System.out.println(sb.capacity());*/
		
		Scanner in;
		in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true){
			/*System.out.println("Enter string");
			String temp = in.nextLine();
			if(temp.equals("exit")){
				break;
			}
			sb.append(temp);*/
			sb.append(in.nextLine());
			if(sb.length()>=4 && sb.toString().substring(sb.length()-4).equals("exit")) break;
		}
		in.close();
		sb.delete(sb.length()-4, sb.length());
		sb.trimToSize();
		System.out.println(sb);
		System.out.println("capacity = "+sb.capacity());
		System.out.println("length = "+sb.length());
		System.out.println("End");
	}
}
