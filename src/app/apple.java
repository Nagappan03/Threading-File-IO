package app;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class apple extends Applet implements ActionListener {
	Label t;
	Label t1;
	Label t2;
	Button b;
	int i = 0;
	int j = 0;

	public void init() {
		t = new Label("00");
		t1 = new Label("00");
		t2 = new Label("00");
		b = new Button("submit");
		add(t);
		add(t1);
		add(t2);
		add(b);
		b.addActionListener(this);
		setLayout(null);
		t.setBounds(50, 50, 70, 30);
		t1.setBounds(50, 100, 70, 30);
		t2.setBounds(50, 150, 70, 30);
		b.setBounds(50, 200, 70, 30);
	}

	public void actionPerformed(ActionEvent ae) {
		
		int sec = 0;
		int min = 0;
		int hrs = 0;
		int secCount = 0;
		int hrsCount = 0;
		if (ae.getSource() == b) {
			while (sec <= 10) {
				try {
					Thread.sleep(500);

				} catch (Exception e) {

				}
				if(sec == 10) {
					sec = 0;
				secCount = secCount + 1;
				String s1 = Integer.toString(secCount);
				t1.setText(s1);
				}
				if(secCount == 10) {
					secCount = 0;
				hrsCount = hrsCount + 1;
				String s2 = Integer.toString(hrsCount);
				t2.setText(s2);
				}
				String s = Integer.toString(i);
				i++;
				
				t.setText(s);
				sec++;

			}
			
			/*
			 * while(y<=10) { if(x==10) { try { Thread.sleep(1000); }
			 * catch(Exception e){
			 * 
			 * } String s1 = Integer.toString(j); j++; t1.setText(s1); y++;
			 * 
			 * } }
			 */
		}
	}
}
