package app;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class orange extends JApplet implements ItemListener {

	Label t;
	JComboBox b;

	public void init() {
		t = new Label();
		b = new JComboBox();
		b.addItem("Select Methods");
		b.addItem("start");
		b.addItem("sleep");
		b.addItem("suspend");
		b.addItem("resume");
		add(t);
		add(b);
		b.addItemListener(this);
		setLayout(null);
		t.setBounds(150, 50, 70, 30);
		b.setBounds(50, 50, 70, 30);

	}

	public void itemStateChanged(ItemEvent ae) {
		if (ae.getStateChange() == ae.SELECTED) {
			if (b.getSelectedItem().equals("start")) {
				Multiple m = new Multiple();
			
				
			}
			if (b.getSelectedItem().equals("sleep")) {

			}
			if (b.getSelectedItem().equals("suspend")) {

			}
			if (b.getSelectedItem().equals("resume")) {

			}
		}
	}

}
