package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class DisplayCarFrame {

	public JFrame displayFrame;
	public JTextArea textArea; 
	public JButton returnButton ;
	public JButton exitButton ;
	private JLabel cars;

	/**
	 * Create the application.
	 */
	public DisplayCarFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		displayFrame = new JFrame();
		displayFrame.setTitle("Car Emporium - Car Entry");
		displayFrame.setBounds(100, 100, 450, 300);
		displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		displayFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		cars = new JLabel("Cars:");
		displayFrame.add(cars);
		
		textArea = new JTextArea();
		displayFrame.getContentPane().add(textArea);
		
		returnButton = new JButton("Return");
		displayFrame.getContentPane().add(returnButton);
		
		exitButton = new JButton("Exit");
		displayFrame.getContentPane().add(exitButton);
		
		
	}

}
