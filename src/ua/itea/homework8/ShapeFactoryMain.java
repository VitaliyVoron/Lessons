package ua.itea.homework8;

import java.util.Scanner;

public class ShapeFactoryMain {

	public static void main(String[] args) {
		Color color = new Color();
		Scanner scan = new Scanner(System.in);
		boolean status = true;
		while (status) {
			System.out.println("Make a choice!\n1 - circle; 2 - square; 3 - triangle; 0 - exit");
			String choice = scan.next();
			switch (choice) {
			case "0":
				status = false;
				System.out.println("END");
				break;
			case "1":
				System.out.println("Enter radius: ");
				int radius = myScanner(scan);
				if (radius > 0) {
					Circle circle = new Circle(color.getColor(), radius);
					System.out.println(circle.getInfo());
				}
				break;
			case "2":
				System.out.println("Enter side: ");
				int side = myScanner(scan);
				if (side > 0) {
					Square square = new Square(color.getColor(), side);
					System.out.println(square.getInfo());
				}
				break;
			case "3":
				System.out.println("Enter side: ");
				int sideT = myScanner(scan);
				if(sideT<=0)break;
				System.out.println("Enter height: ");
				int height = myScanner(scan);
				if(height<=0)break;
				Triangle triangle = new Triangle(color.getColor(), sideT, height);
				System.out.println(triangle.getInfo());
				break;
			default:
				System.out.println("Try again!");
				break;
			}
		}
		scan.close();
	}

	public static int myScanner(Scanner scan) {
		int res = 0;
		if (scan.hasNextInt()) {
			res = scan.nextInt();
			res = res > 0 ? res : -1;
		}
		return res;

	}
}
