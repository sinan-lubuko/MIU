package FinalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CarEntryFrame {

	public  JFrame entryFrame;
	public  JTextField makeTextField;
	public  JTextField modeltext;
	public  JTextField yearText;
	public  JTextField weightText;
	public  JTextField tanksizeText;
	public  JTextField fuelTypeText;
	public  JTextField batterySizeText;
	public  JTextField batteryTypeText;
	protected Object frame;
	public JButton submitButton ;
	public JButton returnButton ;
	public JButton exitButton ;
	public JRadioButton gasRadio;
	public 	JRadioButton electricRadio;
	public JComboBox colorBox;

	
	

	/**
	 * Create the application.
	 */
	public CarEntryFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		entryFrame = new JFrame();
		entryFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		entryFrame.getContentPane().setForeground(Color.WHITE);
		entryFrame.setTitle("Car Empotium - Car Entry");
		entryFrame.setBounds(100, 100, 450, 300);
		entryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		entryFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Make:");
		entryFrame.getContentPane().add(lblNewLabel);
		
		makeTextField = new JTextField();
		entryFrame.getContentPane().add(makeTextField);
		makeTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Model");
		entryFrame.getContentPane().add(lblNewLabel_1);
		
		modeltext = new JTextField();
		entryFrame.getContentPane().add(modeltext);
		modeltext.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Year:");
		entryFrame.getContentPane().add(lblNewLabel_2);
		
		yearText = new JTextField();
		entryFrame.getContentPane().add(yearText);
		yearText.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Weight:");
		entryFrame.getContentPane().add(lblNewLabel_3);
		
		weightText = new JTextField();
		entryFrame.getContentPane().add(weightText);
		weightText.setColumns(10);
		
		
		String[] colors = {"Red", "White", "Black", "Green", "Silver", "Yellow", "Blue"};
		//colorBox.setModel(colors);
		colorBox = new JComboBox(colors);
		entryFrame.getContentPane().add(colorBox);
		
		
		gasRadio = new JRadioButton("Gas?");
		entryFrame.getContentPane().add(gasRadio);
		
		JLabel lblNewLabel_4 = new JLabel("Tank size:");
		entryFrame.getContentPane().add(lblNewLabel_4);
		
		tanksizeText = new JTextField();
		entryFrame.getContentPane().add(tanksizeText);
		tanksizeText.setColumns(10);
	
		JLabel lblNewLabel_5 = new JLabel("Fuel type");
		entryFrame.getContentPane().add(lblNewLabel_5);
		
		fuelTypeText = new JTextField();
		entryFrame.getContentPane().add(fuelTypeText);
		fuelTypeText.setColumns(10);
		
	    electricRadio = new JRadioButton("Electric?");
		entryFrame.getContentPane().add(electricRadio);
		
		JLabel lblNewLabel_6 = new JLabel("Battery Size:");
		entryFrame.getContentPane().add(lblNewLabel_6);
		
		batterySizeText = new JTextField();
		entryFrame.getContentPane().add(batterySizeText);
		batterySizeText.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Battery type:");
		entryFrame.getContentPane().add(lblNewLabel_7);
		
		batteryTypeText = new JTextField();
		entryFrame.getContentPane().add(batteryTypeText);
		batteryTypeText.setColumns(10);
		
		submitButton = new JButton("Submit");
		entryFrame.getContentPane().add(submitButton);
		
		returnButton = new JButton("Return");
		entryFrame.getContentPane().add(returnButton);
		
	    exitButton = new JButton("Exit");
		entryFrame.getContentPane().add(exitButton);
	}

}
