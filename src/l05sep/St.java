package l05sep;

import java.util.Scanner;

public class St {

	public static void main(String[] args) {
		String str="1";
		/*for(int i=0;i<=100;i++){
			str+=i;
		}
		System.out.println(str);*/
		
		/*StringBuilder sb=new StringBuilder(70);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("123456789012345678901234567890123");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("12");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		StringBuilder s = new StringBuilder();
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		do{
			sb.append(in.nextLine());
			//String word=in.nextLine();
		    //System.out.println(in.nextLine());
		    if(sb.length()>=4 && sb.toString().substring(sb.length()-5).equals("exit")) break;
		}while(true);
		sb.delete(sb.length()-4, sb.length());
		System.out.println(sb);*/
		
		StringBuilder sb = new StringBuilder();
		sb.append("123567");
		sb.insert(3,  "4");
		sb.replace(3, 6, "hi");
		System.out.println(sb);
		
		StringBuffer sf = new StringBuffer();
		//System.out.println(sb.charAt(0));
		}
	}


