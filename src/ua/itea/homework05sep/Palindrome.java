package ua.itea.homework05sep;

import java.util.Scanner;

public class Palindrome {
 	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word:");
		String str = in.nextLine().toLowerCase();
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		boolean isPolindrome = true;
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] == arr[arr.length - (i + 1)]) {
			} else {
				isPolindrome = false;
			}
		}
		in.close();
		System.out.println(isPolindrome ? "It's polindrome" : "It's not polindrome");
	}
}
