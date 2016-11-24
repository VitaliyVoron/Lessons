package ua.itea.homework14JSPShapes;

public class Color {

	String[] color = { "blue", "red", "white", "black", "yellow", "grey", "green", "orange", "gold", "brown" };

	public String getColor() {
		return color[(int) (Math.random() * color.length)];
	}

}
