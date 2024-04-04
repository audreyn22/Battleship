import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener{

	//the button for this listener
	JButton theButton;
	
	//add constructor
	public ButtonListener(JButton button) {
		this.theButton = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// this method is triggered when there is a click on a button
		theButton.setText("X");
		theButton.setEnabled(false);
		theButton.setBackground(new Color(0, 0, 255));
	}

	
	
	
	
	
}
