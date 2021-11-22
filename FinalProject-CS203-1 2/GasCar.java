package FinalProject;

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
