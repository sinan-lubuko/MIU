CarEntryFrame.java                                                                                  000644  000765  000024  00000007674 14145300342 020055  0                                                                                                    ustar 00enkhtsetsegunurbayar            staff                           000000  000000                                                                                                                                                                         package FinalProject;

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
                                                                    CarProgram.java                                                                                     000644  000765  000024  00000017513 14145307346 017414  0                                                                                                    ustar 00enkhtsetsegunurbayar            staff                           000000  000000                                                                                                                                                                         package FinalProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CarProgram {

	public static List<Car>		cars = new ArrayList<Car>();
	public static void main(String[] args) {
		MainMenuFrame 		m = new MainMenuFrame();
		CarEntryFrame 		ce = new CarEntryFrame();
		DisplayCarFrame 	dc = new DisplayCarFrame();

		File	file = new File("/Users/enkhtsetsegunurbayar/Desktop/FinalCars.txt");
		if(file.isFile() && file.canRead()) {
			try {
				FileInputStream		stream = new FileInputStream(file);
				ObjectInputStream	object = new ObjectInputStream(stream);
				cars = ((List<Car>)object.readObject());
			}catch(Exception ooo) {
					System.out.println("file can not read");
			}
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					m.carFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//Car Entry button
		m.entryButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ce.entryFrame.setVisible(true);
				m.carFrame.setVisible(false);
				
			}
		});
		
		//Car Display button
		m.displayButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				m.carFrame.setVisible(false);
				dc.displayFrame.setVisible(true);
				String str= "";
				for(Car c : cars) {
					str +=c + "\n";
				
				}
				dc.textArea.setText(str);
				m.carFrame.setVisible(false);
				dc.displayFrame.setVisible(true);	
			}
		});
		
		
		
		
		ce.gasRadio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ce.gasRadio.setSelected(true);
				ce.batterySizeText.setEditable(false);
				ce.batterySizeText.setBackground(Color.gray);
				ce.batteryTypeText.setEditable(false);
				ce.batteryTypeText.setBackground(Color.gray);
				ce.electricRadio.setSelected(false);
			}	
		});
		
		ce.electricRadio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ce.electricRadio.setSelected(true);
				ce.tanksizeText.setEditable(false);
				ce.tanksizeText.setBackground(Color.gray);
				ce.fuelTypeText.setEditable(false);
				ce.fuelTypeText.setBackground(Color.gray);
				ce.gasRadio.setSelected(false);
				
			}	
		});
		
		//submit button
		ce.submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ce.makeTextField.getText().isEmpty()||ce.makeTextField.getText().isBlank()) {
					JOptionPane.showMessageDialog(ce.submitButton, "Meke can not be blank or numeric value");
					return;
				}
			
				if(ce.modeltext.getText().isEmpty()||ce.modeltext.getText().isBlank()) {
					JOptionPane.showMessageDialog(ce.submitButton, "Model can not be blank or numeric value");
					return;
				}
				if(ce.yearText.getText().isEmpty()||ce.yearText.getText().isBlank()) {
					JOptionPane.showMessageDialog(ce.submitButton, "Year can not be blank and it hac to be numeric value");
					return;
				}
				int year = 0;
				double tankSize = 0;
				double batterySize = 0;
				try {
					year = Integer.parseInt(ce.yearText.getText());		
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(ce.submitButton, "Year have to be numeric");
				}
				if(ce.weightText.getText().isEmpty()||ce.weightText.getText().isBlank()) {
					JOptionPane.showMessageDialog(ce.submitButton, "Year can not be blank and it has to be numeric value");
					return;
				}
				double weight = 0;
				try {
					weight = Double.parseDouble(ce.weightText.getText());
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(ce.submitButton, "Weight have to be fraction numeric  value");
				}
				if(ce.gasRadio.isSelected() ) {
					try {
						tankSize = Double.parseDouble(ce.tanksizeText.getText());
					}catch(Exception e3) {
						JOptionPane.showMessageDialog(ce.submitButton, "Tank size have to be fraction numeric  value");	
					}
					if(ce.fuelTypeText.getText().isEmpty()||ce.fuelTypeText.getText().isBlank()) {
						JOptionPane.showMessageDialog(ce.submitButton, "Fuel type can not be blank and it has to be numeric value");
						return;
					}
					if(ce.tanksizeText.getText().isEmpty()||ce.tanksizeText.getText().isBlank()) {
						JOptionPane.showMessageDialog(ce.submitButton, "Tank size can not be blank and it has to be numeric value");
						return;
					}
					String	color = (String) ce.colorBox.getItemAt(ce.colorBox.getSelectedIndex());
					Car		gasCar = new GasCar(ce.makeTextField.getText(), ce.modeltext.getText(), color, year, weight,ce.fuelTypeText.getText(),tankSize );
					cars.add(gasCar);
					ce.fuelTypeText.setText("");
					ce.tanksizeText.setText("");
					ce.batterySizeText.setEditable(true);
					ce.batterySizeText.setBackground(Color.white);
					ce.batteryTypeText.setEditable(true);
					ce.batteryTypeText.setBackground(Color.white);
				}else if (ce.electricRadio.isSelected() ) {
					try {
						batterySize = Double.parseDouble(ce.batterySizeText.getText());
					}catch(Exception e4) {
						JOptionPane.showMessageDialog(ce.submitButton, "Battery Size have to be  numeric  value");
					}
					if(ce.batteryTypeText.getText().isEmpty()||ce.batteryTypeText.getText().isBlank()) {
						JOptionPane.showMessageDialog(ce.submitButton, "Battery type can not be blank and it has to be numeric value");
						return;
					}
					if(ce.batterySizeText.getText().isEmpty()||ce.batterySizeText.getText().isBlank()) {
						JOptionPane.showMessageDialog(ce.submitButton, "Battery size can not be blank and it has to be numeric value");
						return;
					}
					String color= (String) ce.colorBox.getItemAt(ce.colorBox.getSelectedIndex());
					Car electricCar =new ElectricCar(ce.makeTextField.getText(), ce.modeltext.getText(), color, year, weight, batterySize, ce.batteryTypeText.getText() );
					cars.add(electricCar);
					ce.batterySizeText.setText("");
					ce.batteryTypeText.setText("");
					ce.tanksizeText.setEditable(true);
					ce.tanksizeText.setBackground(Color.white);
					ce.fuelTypeText.setEditable(true);
					ce.fuelTypeText.setBackground(Color.white);
					}else{
						JOptionPane.showMessageDialog(ce.submitButton, "You must to select the car type");
						return;
					}
				ce.yearText.setText("");
				ce.makeTextField.setText("");
				ce.modeltext.setText("");
				ce.weightText.setText("");
				JOptionPane.showMessageDialog(ce.submitButton, "car information submitted successfully");
			}
		});
		
		//return buttons
		ce.returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				m.carFrame.setVisible(true);
				ce.entryFrame.setVisible(false);
				
			}
			
		});
		
		dc.returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dc.displayFrame.setVisible(false);
				m.carFrame.setVisible(true);
			}
			
		});
		
		//Exit buttons
		exitListener(ce.exitButton);
		exitListener(m.exitButton);
		exitListener(dc.exitButton);
		
	}
	
	//Exit for all exit buttons
	public static void exitListener(JButton button) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				closeApp();
			}
			void closeApp(){
			try {
				FileOutputStream fileOutput = new FileOutputStream("/Users/enkhtsetsegunurbayar/Desktop/FinalCars.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fileOutput);
				oos.writeObject(cars);
				oos.close();
				fileOutput.close();	
			} catch (Exception e) {		
				e.printStackTrace();
			}	
			System.exit(0);
			}			
		});
	}
}

	


                                                                                                                                                                                     DisplayCarFrame.java                                                                                000644  000765  000024  00000002230 14145303226 020344  0                                                                                                    ustar 00enkhtsetsegunurbayar            staff                           000000  000000                                                                                                                                                                         package FinalProject;

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
                                                                                                                                                                                                                                                                                                                                                                        ElectricCar.java                                                                                    000644  000765  000024  00000001541 14145301714 017522  0                                                                                                    ustar 00enkhtsetsegunurbayar            staff                           000000  000000                                                                                                                                                                         package FinalProject;

public class ElectricCar extends Car {
	
	private double batterySize;
	private String batteryType;
	
	public ElectricCar(String make, String model, String color, int year, double weight,double  batterySize, String batteryType
			) {
		super(make, model, color, year, weight);
		this.batteryType = batteryType;
		this.batterySize = batterySize;
	}

	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Battery size: " + batterySize + " Battery Type: " + batteryType ;
	}




	public String getBatteryType() {
		return batteryType;
	}


	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}


	public double getBatterySize() {
		return batterySize;
	}


	public void setBatterySize(double battereySize) {
		this.batterySize = battereySize;
	}

	
	
	
	
}
                                                                                                                                                               GasCar.java                                                                                         000644  000765  000024  00000001346 14145301637 016511  0                                                                                                    ustar 00enkhtsetsegunurbayar            staff                           000000  000000                                                                                                                                                                         package FinalProject;

public class GasCar extends Car {
	
	private String fueltype;
	private double fuelSize;
	
	
	
	public GasCar(String make, String model, String color, int year, double weight, String fueltype, double fuelSize) {
		super(make, model, color, year, weight);
		this.fueltype = fueltype;
		this.fuelSize = fuelSize;
	}



	@Override
	public String toString() {
		
		return super.toString() + " Fuel Type: " + fueltype + " Tank Size: " + fuelSize;
	}



	public String getFueltype() {
		return fueltype;
	}



	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}



	public double getFuelSize() {
		return fuelSize;
	}



	public void setFuelSize(double fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	

}
                                                                                                                                                                                                                                                                                          MainMenuFrame.java                                                                                  000644  000765  000024  00000001753 14145132263 020034  0                                                                                                    ustar 00enkhtsetsegunurbayar            staff                           000000  000000                                                                                                                                                                         package FinalProject;

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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     