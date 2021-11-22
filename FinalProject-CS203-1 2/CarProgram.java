package FinalProject;

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

	


