package FinalProject;

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
