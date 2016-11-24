package ua.itea.less9;

public class OuterMain {

	public static void main(String[] args) {
		new Outer().new Inner();
		System.out.println(Outer.Nested.nPub);
	}

}
