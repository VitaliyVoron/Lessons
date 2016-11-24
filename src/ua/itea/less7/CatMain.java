package ua.itea.less7;

public class CatMain {

	public static void main(String[] args) {
		CatBox box;
		box = new CatBox();
		System.out.println(box);
		box.width=10;
		box.height=10;
		box.depth=10;
		box.getInfo();
		CatBox bigBox = new CatBox();
		System.out.println(bigBox);
		bigBox.depth=100;
	}

}
