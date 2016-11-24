package ua.itea.homework15ShapesGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class GUI extends JFrame {
	private JButton buttonCircle = new JButton("Circle", new ImageIcon("resources/Circle.png"));
	private JButton buttonSquare = new JButton("Square", new ImageIcon("resources/Box.png"));
	private JButton buttonTriangle = new JButton("Triangle", new ImageIcon("resources/triangle.png"));
	private JButton buttonShowAll = new JButton("Show all shapes from DB");
	private JButton buttonShowNewShapes = new JButton("Show new shapes");
	private JButton buttonAddNewShapesToDB = new JButton("Add new Shapes to DB");
	private JButton buttonCreateCircle = new JButton("Create circle");
	private JButton buttonCreateSquare = new JButton("Create square");
	private JButton buttonCreateTriangle = new JButton("Create triangle");
	private JButton buttonBackToMainMenu = new JButton("Back to maine menu");

	private JLabel label = new JLabel();
	private JLabel labelRadius = new JLabel("Radius");
	private JLabel labelSideSquare = new JLabel("Side");
	private JLabel labelSideTriangle = new JLabel("Side");
	private JLabel labelHeightTriangle = new JLabel("Height");

	JTextField jFieldRadius = new JTextField();
	JTextField jFieldSideSquare = new JTextField();
	JTextField jFieldSideTriangle = new JTextField();
	JTextField jFieldHeightTriangle = new JTextField();
	JScrollPane scroll = new JScrollPane(label);

	JPanel panelMain = new JPanel();
	JPanel panelCircle = new JPanel();
	JPanel panelSquare = new JPanel();
	JPanel panelTriangle = new JPanel();

	ControllerShapes con;
	Color color;

	public GUI(Color color,ControllerShapes con) throws SQLException, ClassNotFoundException {
		super("Shapes factory");
		setLocation(350, 100);

		this.con = con;
		this.color = color;

		panelMain.setLayout(null);
		panelCircle.setLayout(null);
		panelSquare.setLayout(null);
		panelTriangle.setLayout(null);

		buttonCircle.setBounds(10, 10, 180, 50);
		buttonSquare.setBounds(10, 70, 180, 50);
		buttonTriangle.setBounds(10, 130, 180, 50);
		buttonShowAll.setBounds(10, 190, 180, 50);
		buttonShowNewShapes.setBounds(10, 250, 180, 50);
		buttonAddNewShapesToDB.setBounds(10, 310, 180, 50);

		scroll.setBounds(220, 10, 350, 500);
		buttonBackToMainMenu.setBounds(10,490,180,50);

		buttonCreateCircle.setBounds(10, 10, 180, 50);
		labelRadius.setBounds(10, 60, 50, 20);
		jFieldRadius.setBounds(10, 90, 100, 20);

		buttonCreateSquare.setBounds(10, 10, 180, 50);
		labelSideSquare.setBounds(10, 60, 50, 20);
		jFieldSideSquare.setBounds(10, 90, 100, 20);

		buttonCreateTriangle.setBounds(10, 10, 180, 50);
		labelSideTriangle.setBounds(10, 60, 50, 20);
		jFieldSideTriangle.setBounds(10, 90, 100, 20);
		labelHeightTriangle.setBounds(10, 120, 50, 20);
		jFieldHeightTriangle.setBounds(10, 150, 100, 20);

		panelMain.add(buttonCircle);
		panelMain.add(buttonSquare);
		panelMain.add(buttonTriangle);
		panelMain.add(buttonShowAll);
		panelMain.add(buttonShowNewShapes);
		panelMain.add(buttonAddNewShapesToDB);
		panelMain.add(scroll);

		panelCircle.add(buttonCreateCircle);
		panelCircle.add(labelRadius);
		panelCircle.add(jFieldRadius);

		panelSquare.add(buttonCreateSquare);
		panelSquare.add(labelSideSquare);
		panelSquare.add(jFieldSideSquare);

		panelTriangle.add(buttonCreateTriangle);
		panelTriangle.add(labelSideTriangle);
		panelTriangle.add(jFieldSideTriangle);
		panelTriangle.add(labelHeightTriangle);
		panelTriangle.add(jFieldHeightTriangle);

		setContentPane(panelMain);
		setSize(600, 600);
		setResizable(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListers();
		setVisible(true);
	}

	private void initListers() {
		buttonShowNewShapes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
					label.setText(con.getInfoAllNewShapesFromCollections());
			}
		});

		buttonAddNewShapesToDB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					con.addNewShapesToDB();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				label.setText("New shapes added to DB");
			}
		});

		buttonShowAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					label.setText(con.getInfoAllShapes());
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});

		buttonBackToMainMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(panelCircle.isVisible()){
					panelCircle.setVisible(false);
				} else if(panelSquare.isVisible()){
					panelSquare.setVisible(false);
				} else if(panelTriangle.isVisible()){
					panelTriangle.setVisible(false);
				}
				label.setText("");
				panelMain.add(scroll);
				setContentPane(panelMain);
				panelMain.setVisible(true);
			}
		});

		buttonCircle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panelMain.setVisible(false);
				panelCircle.add(buttonBackToMainMenu);
				label.setText("");
				panelCircle.add(scroll);
				setContentPane(panelCircle);
				panelCircle.setVisible(true);
			}
		});

		buttonSquare.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panelMain.setVisible(false);
				panelSquare.add(buttonBackToMainMenu);
				label.setText("");
				panelSquare.add(scroll);
				setContentPane(panelSquare);
				panelSquare.setVisible(true);
			}
		});

		buttonTriangle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panelMain.setVisible(false);
				panelTriangle.add(buttonBackToMainMenu);
				label.setText("");
				panelTriangle.add(scroll);
				setContentPane(panelTriangle);
				panelTriangle.setVisible(true);
			}
		});

		buttonCreateCircle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int radius = 0;
				Shape shape = null;
				try {
					radius = Integer.parseInt(jFieldRadius.getText());
				} catch (NumberFormatException e) {
				}
				if (radius <= 0) {
					label.setText("Enter correct radius!!!");
				} else {
					shape = new Circle(color.getColor(), radius);
					con.addShapeToCollections(shape);
					label.setText("<html>You created new shepe and added it to DB:<br/>" + shape.getInfo() + "</html>");
				}
			}
		});

		buttonCreateSquare.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int side = 0;
				Shape shape = null;
				try {
					side = Integer.parseInt(jFieldSideSquare.getText());
				} catch (NumberFormatException e) {
				}
				if (side <= 0) {
					label.setText("Enter correct side!!!");
				} else {
					shape = new Square(color.getColor(), side);
					con.addShapeToCollections(shape);
					label.setText("<html>You created new shepe and added it to DB:<br/>" + shape.getInfo() + "</html>");
				}
			}
		});

		buttonCreateTriangle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int side = 0;
				int height = 0;
				Shape shape = null;
				try {
					side = Integer.parseInt(jFieldSideTriangle.getText());
					height = Integer.parseInt(jFieldHeightTriangle.getText());
				} catch (NumberFormatException e) {
				}
				if (side <= 0 || height <= 0) {
					label.setText("Enter correct parameters!!!");
				} else {
					shape = new Triangle(color.getColor(), side, height);
					con.addShapeToCollections(shape);
					label.setText("<html>You created new shepe and added it to DB:<br/>" + shape.getInfo() + "</html>");
				}
			}
		});

	}

}
