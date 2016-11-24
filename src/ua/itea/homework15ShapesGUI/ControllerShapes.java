package ua.itea.homework15ShapesGUI;

import java.sql.SQLException;

public class ControllerShapes {

	GUI gui;
	Connector con;
	Color color;
	//ArrayMemory arr;
	TreeSetMemory treeSet;

	public ControllerShapes(Connector con) throws SQLException, ClassNotFoundException {

		this.con = con;
		color = new Color();
		//gui = new GUI(color);
		//arr = new ArrayMemory();
		treeSet = new TreeSetMemory();
	}

	public String getInfoAllShapes() throws SQLException {
		try {
			return con.getInfoAllShapes();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addShapeToCollections(Shape shape) {
		treeSet.addShapeToTreeSet(shape);
	}

	public String getInfoAllNewShapesFromCollections() {
		return treeSet.getInfoAllShapes();
	}

	public void addNewShapesToDB() throws SQLException {
		for(Shape s: treeSet.getShapesTree()){
			con.addShapeToDB(s);
		}
		treeSet.clearTree();
	}

	/*public void addShapeToArray(Shape shape){
		arr.addShape(shape);
	}*/

	/*public void addNewShapesToDB() throws SQLException {
		for(Shape s: arr.getShapes()){
			con.addShapeToDB(s);
		}
		arr.clearArray();
	}*/

	/*public String getInfoAllNewShapesFromArray(){
			return arr.getInfoAllShapes();
	}*/

}
