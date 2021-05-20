package training.qa.garage;

public abstract class Vehicle implements VehicleActions{
	
	private double tankSize;
	private String manufacturer;
	private int topSpeed;
	private String speedUnits;
	private int numWheels; 
	private String model;
	private String owner;
	
	
	public Vehicle(String model, String manufacturer, double tankSize, int topSpeed, String speedUnits, int numWheels, String  owner) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.tankSize = tankSize;
		this.topSpeed = topSpeed;
		this.speedUnits = speedUnits;
		this.numWheels = numWheels;
		this.owner = owner;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public String getModel() {
		return this.model;
	}
	
	
	public int getTopSpeed() {
		return this.topSpeed;
	}; 
	
	
	public String getManufacturer() {
		return this.manufacturer;
	};
	
	
	public int getNumWheels() {
		return this.numWheels;
	};
	
	public String getCompleteDetails() {
		
		return String.format("Vehicle Model: %s\n Manufacturer: %s\n Tank Size: %d\n Top Speed: %d%s\n Number of Wheels: %d\n ------------", this.model, this.manufacturer, this.tankSize, this.topSpeed, this.speedUnits, this.numWheels);
		
		
	}

	
}
