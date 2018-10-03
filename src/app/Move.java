package app;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Move extends JApplet implements ActionListener {

	TextField t;
	Button b;
	int y = 0;
	int i =0;
	
	public void init() {
		t = new TextField();
		b = new Button("Move");
		add(t);
		add(b);
		b.addActionListener(this);
		setLayout(null);
		t.setBounds(50, 10, 70, 30);
		b.setBounds(50,100,40,40);
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == b) {
			
			while(i<10) {
				y = y + 50;
				t.setBounds(50, y, 70, 30);
				i++;
				
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					
				}
				
			}
			
		}
	}

	

}
