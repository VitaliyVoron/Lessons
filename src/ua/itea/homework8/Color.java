package ua.itea.homework8;

public class Color {

	String[] color = { "Blue", "Red", "White", "Black", "Yellow", "Grey", "Green", "Orange", "Gold", "Brown" };

	public String getColor() {
		return color[(int) (Math.random() * color.length)];
	}

}
