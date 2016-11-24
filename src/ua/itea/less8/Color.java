package ua.itea.less8;

public class Color {
	
	String[] color = {"Blue", "Red", "Wite"};

	public String getColor() {
		return color[(int)(Math.random()*color.length)];
	}
	
	
}
