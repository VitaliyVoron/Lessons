package ua.itea.homework04;

import java.util.Scanner;

/*
*вводиться пароль, определить криптоустойчив 
*ли он(длинна не менее 8 символов, минимум 2 цыфры и буквы разных регистров)
*/

public class Password {

	public static void main(String[] args) {
		String pass;
		int limit = 3;
		Scanner in = new Scanner(System.in);
		int amountNumber = 0;
		boolean isMoreThenSevenSimbols = false;
		boolean differentRegister = false;
		boolean access = false;
		System.out.println("Enter password");
		while (limit > 0 && !access) {
			pass = in.nextLine();
			limit--;
			if (pass.equals(pass.toLowerCase())) {
			} else if (pass.equals(pass.toUpperCase())) {
			} else {
				differentRegister = true;
			}
			String numbers = "1234567890";
			for (int i = 0; i < pass.length(); i++) {
				char temp = pass.charAt(i);
				for (int j = 0; j < numbers.length(); j++) {
					if (temp == numbers.charAt(j)) {
						amountNumber++;
					}
				}
			}
			if (pass.length() >= 8) {
				isMoreThenSevenSimbols = true;
			}
			if (amountNumber > 1 && isMoreThenSevenSimbols && differentRegister) {
				System.out.println("Access allowed");
				access = true;
			} else if(limit > 0 && !access) {
				System.out.println("Enter correct password!!! You have only - "+ limit +" attempts!\n"
						+ "The password must contain at least two numbers,\n"
						+ "to have at least eight characters, letters must be different registers!!!");
			} else {
				System.out.println("You haven't attempts");
			}
		}
		in.close();
	}
}
