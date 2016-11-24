package ua.itea.homework06;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] field = new char[10][10];
		char plate = '_';
		
		char pers = '|';
		int persY = 0;
		int persX = 0;
		int health = 80;
		
		char aidKit = '+';
		int aidKitType;
		int aidY = (int)(1+(Math.random()*7));
		int aidX = (int)(1+(Math.random()*7));
		
		char bomb = '*';
		int bombY = (int)(1+(Math.random()*7));
		int bombX = (int)(1+(Math.random()*7));
		
		boolean stairs = false;
		String slot = "Empty";
		aidKitType = (int)((Math.random()*41) <= 20? 20:40);
		while (true) {
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field.length; j++) {
					field[i][j] = plate;
					if(i == field.length-1 && j == 0){
						field[i][j] = 'X';
					}
				}
			}
			field[aidY][aidX] = aidKit;
			field[bombY][bombX] = bomb;
			field[persY][persX] = pers;
			
			if(persY == bombY && persX == bombX){
				System.out.println("BOOM"+" You are loose 20 helth");
				health -= 20;
				bomb = plate;
				bombX = 0;
			} else if(persY == aidY && persX == aidX){
				System.out.println("You have one aid kit!");
				aidKit = plate;
				aidX = 0;
				slot = aidKitType == 20? "smole aid kit": "large aid kit";
			} else if (persY == field.length-1 && persX == 0){
				System.out.println("Congratulations! You won!");
				break;
			} else if(health == 0) {
				System.out.println("You died!/nGAME OVER");
			}
			
			System.out.println("Health - " + health);
			System.out.println("Slot - " + slot);
			for (int i = 0; i < field.length; i++) {
				System.out.print("|");
				for(int j = 0; j < field[i].length; j++){
				System.out.print(field[i][j]+" ");
				}
				System.out.println("|");
			}
			
			String action;
			System.out.println("Choose your action:");
			action = "" + scan.nextLine().toLowerCase();
			switch (action) {
			case "d":
				if (persX < field[persY].length - 1) {
					persX++;
				} else if (persX == field[persY].length - 1 && !stairs) {
					persY++;
					stairs = true;
				}
				health--;
				break;
			case "a":
				if (persX > 0) {
					persX--;
				} else if (persX == 0 && stairs) {
					persY++;
					stairs = false;
				}
				health--;
				break;
			case "1":
				health+=aidKitType;
				slot="Empty";
				break;
			default:
				System.out.println("Choose correct action");
				break;
			}
			
		}
		scan.close();
	}
}
