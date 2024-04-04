import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Battleship extends JFrame{
	
	private int screenWidth = 800;
	private int screenHeight = 600;
	
	//constructor - create the GUI
	public Battleship() {
		
		//call the super class helper methods
		//to customize the view
		super.setTitle("Battleship");
		super.setSize(screenWidth, screenHeight);
		
		//we will practice using the layout managers which
		//will govern how widgets are placed on the screen
		super.setLayout(new BorderLayout());
		
		//add widgets
		//1) create a J Panel
		//create a widget to add to the JPanel
		//3) add the JPanel to the JFrame
		JPanel topPanel = new JPanel();
		JLabel instructions = new JLabel("Click the buttons to play");
		
		//add JLabel to panel
		topPanel.add(instructions);
		
		//add the top panel to the JFrame (the view you're creating)
		super.add(topPanel, BorderLayout.NORTH);
		
		//add the bottom panel
		JPanel bottomPanel = new JPanel();
		bottomPanel.add(new JLabel("Coded by Audrey and Lochana"));
		super.add(bottomPanel, BorderLayout.SOUTH);
		
		
		//adding a widget with interaction too
		JPanel centerPanel = new JPanel();
		
		//example use of GRID LAYOUT
		centerPanel.setLayout(new GridLayout(8, 8));
		
		//create a total of 64 buttons to add to the panel
		for(int row = 0; row < 8; row++) {
			for(int col = 0; col < 8; col++) {
				JButton button = new JButton("*");
				
				//connect button to a listener to listen for click events
				button.addActionListener(new ButtonListener(button));
				
				centerPanel.add(button);
			}
		}
		
		//add the panel to the view!
		super.add(centerPanel, BorderLayout.CENTER);
		
		
		//end adding widgets
		
		
		//set default action for the x button
		//the program continues running without the GUI if you get this
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//once you're done setting up the GUI, set it to visible
		super.setVisible(true);
		
		
	}
	
	

}
