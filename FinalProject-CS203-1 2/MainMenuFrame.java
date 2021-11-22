package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MainMenuFrame {

	public JFrame carFrame;
	public JButton entryButton;
	public JButton displayButton;
	public JButton exitButton;
	

	/**
	 * Create the application.
	 */
	public MainMenuFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		carFrame = new JFrame();
		carFrame.setTitle("Car Emporium");
		carFrame.setBounds(100, 100, 450, 300);
		carFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		entryButton = new JButton("Car Entry");
		carFrame.getContentPane().add(entryButton);
		
		displayButton = new JButton("Car Display");
		carFrame.getContentPane().add(displayButton);
		
		exitButton = new JButton("Exit");
		carFrame.getContentPane().add(exitButton);
	}

	

}
