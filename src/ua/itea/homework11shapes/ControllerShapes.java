package ua.itea.homework11shapes;

import java.sql.SQLException;
import java.util.Scanner;

public class ControllerShapes {

	Scanner scan;
	Connector dataB;
	Color color;
	View view;

	public ControllerShapes() {
	}

	public ControllerShapes(Scanner scan, Connector dataB, Color color, View view) throws SQLException {
		this.scan = scan;
		this.dataB = dataB;
		this.color = color;
		this.view = view;
		engine();
	}

	public void engine() throws SQLException {

		boolean status = true;
		while (status) {
			view.output("Make a choice!\n1 - circle; 2 - square; 3 - triangle; 4 - show all shapes; 0 - exit");
			String choice = scan.next();
			switch (choice) {
			case "0":
				status = false;
				view.output("END");
				break;
			case "1":
				view.output("Enter radius: ");
				int radius = myScanner(scan);
				if (radius > 0) {
					Shape circle = new Circle(color.getColor(),radius);
					view.output(circle.getInfo());
					dataB.addShapeToDB(circle);
				}
				break;
			case "2":
				view.output("Enter side: ");
				int side = myScanner(scan);
				if (side > 0) {
					Shape square = new Square(color.getColor(),side);
					view.output(square.getInfo());
					dataB.addShapeToDB(square);
				}
				break;
			case "3":
				view.output("Enter side: ");
				int sideT = myScanner(scan);
				if (sideT <= 0)
					break;
				view.output("Enter height: ");
				int height = myScanner(scan);
				if (height <= 0)
					break;
				Shape triangle = new Triangle(color.getColor(),sideT,height);
				view.output(triangle.getInfo());
				dataB.addShapeToDB(triangle);
				break;
			case "4":
				view.output(dataB.getInfoAllShapes());
			default:
				view.output("Try again!");
				break;
			}
		}
	}

	public int myScanner(Scanner scan) {
		int res = 0;
		if (scan.hasNextInt()) {
			res = scan.nextInt();
			res = res > 0 ? res : -1;
		}
		return res;
	}
}
