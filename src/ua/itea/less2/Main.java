package ua.itea.less2;

public class Main {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("name=vitaliy&password=11111&action=Enter");
		System.out.println(sb.substring(28));
		System.out.println();
		Dog dog = new Dog();
		dog.voice();
		Cat cat = new Cat();
		cat.voice();

	}

}
