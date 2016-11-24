package ua.itea.homework03;

public class FibonachiNambers {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int i = 1;
		while (i < 22) {
			int num3;
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.println(i + " - " + num1);
			i++;
		}

	}

}
