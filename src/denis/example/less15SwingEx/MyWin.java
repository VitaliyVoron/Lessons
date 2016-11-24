package denis.example.less15SwingEx;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyWin extends JFrame{
	JButton button=new JButton("SEND1");
	JButton button2=new JButton("SEND2");
	JButton button3=new JButton("SEND3");
	JButton button4=new JButton("SEND4");
	JButton button5=new JButton("SEND5");
	JButton button6=new JButton("SEND6");
	JLabel label=new JLabel("Waiting for click...");
	MyWin(){
		super("Demo SWING v1.0.");
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(2,3,5,10));
		panel.add(button);
		panel.add(button2);
		panel.add(label);
		//panel.add(button4);
		//panel.add(button5);
		//panel.add(button6);
		setContentPane(panel);
		setSize(200,200);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListers();
	}
	private void initListers() {
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				label.setText("Button was pressed");
				
			}});
		
	}
	
}
