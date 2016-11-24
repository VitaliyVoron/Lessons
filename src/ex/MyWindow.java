package ex;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyWindow extends JFrame{
	JButton button1;
	JLabel label2;
	JButton button2;
	JLabel label1;
	int counter=0;
	JPanel panel1;
	JPanel panel2;
	MyWindow(){
		super("First window v 1.1");
		button1=new JButton("To JPanel 2");
		label1=new JLabel("JPanel #1");
		label2=new JLabel("JPanel #2");
		button2=new JButton("To JPanel 1");
		
		panel1=new JPanel();
		panel1.setLayout(new GridLayout(1,1,5,10));
		panel1.add(label1);
		panel1.add(button1);
	
		setContentPane(panel1);
		
		
		panel2=new JPanel();
		panel2.setLayout(new GridLayout(1,1,5,10));
		panel2.add(label2);;
		panel2.add(button2);
		
		
		setSize(300,300);
		setResizable(false);
		initListeners();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void initListeners() {
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				setContentPane(panel2);
				panel2.setVisible(true);
				
			}});
		button2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				setContentPane(panel1);
				panel1.setVisible(true);
				
			}});
		
	}
}
