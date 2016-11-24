package ua.itea.homework9Pudge;

import java.sql.*;

public class PudgeMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		int min = 20;
		int max = 30;
		Pudge p1 = new Pudge(myRandom(min, max), myRandom(min, max), myRandom(min, max));
		Pudge p2 = new Pudge(myRandom(min, max), myRandom(min, max), myRandom(min, max));
		Item item1 = new Item("helmet");
		Item item2 = new Item("gloves");
		p1.addItem(item1);
		p2.addItem(item2);
		new Controller(p1, p2);
		
	}
	
	public static int myRandom(int min, int max) {
		return (int) (min + Math.random() * (max - min + 1));
	}

}
