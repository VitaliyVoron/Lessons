package ua.itea.homework03;

import java.util.Scanner;

public class NumberGameWithComputer {

	public static void main(String[] args) {

		Scanner in;
		in = new Scanner(System.in);
		boolean hit = false;
		int number;
		number = (int) (Math.random() * 100);
		System.out.println(number);
		int numAttempts = 5;
		while (numAttempts > 0 && !hit) {
			System.out.println("You have only " + numAttempts + " attempts! Enter your number:");
			int inputNum = in.nextInt();
			if (inputNum == number) {
				hit = true;
			} else if (inputNum < number && numAttempts > 1) {
				System.out.println("You miss!");
				System.out.println("My number is greater then yours!");
			} else if (inputNum > number && numAttempts > 1) {
				System.out.println("You miss!");
				System.out.println("My number is smaller then yours!");
			}
			numAttempts--;
		}
		in.close();
		if (!hit) {
			System.out.println("My number = " + number + "!!!");
			System.out.println("GAME OVER");
		} else {
			System.out.println("YOU WON!!!");
		}
	}

}
