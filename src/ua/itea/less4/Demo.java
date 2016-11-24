package ua.itea.less4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner in; 
		while (true) {
			in = new Scanner(System.in);
			System.out.println("Enter");
			if (in.hasNextInt()) {
				int a = in.nextInt();
				System.out.println(++a);
				break;
			} else {
				System.out.println("Wrong");
			}
		}
		in.close();
		System.out.println("End");

	}

}
