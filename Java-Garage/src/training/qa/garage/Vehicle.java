package training.qa.garage;

public abstract class Vehicle implements VehicleActions{
	
	private double tankSize;
	private String manufacturer;
	private int topSpeed;
	private String speedUnits;
	private int numWheels; 
	private String model;
	private String owner;
	private String type;
	private int vehicleId;
	
	
	public Vehicle(String model, String manufacturer, double tankSize, int topSpeed, String speedUnits, int numWheels, String  owner, String type, int id) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.tankSize = tankSize;
		this.topSpeed = topSpeed;
		this.speedUnits = speedUnits;
		this.numWheels = numWheels;
		this.owner = owner;
		this.type = type;
		this.vehicleId = id;
	}
	
	public int getVehicleId() {
		return this.vehicleId;
	}
	
	public String getType() {
		return this.type;
	}
	
	public double getTankSize() {
		return this.tankSize;
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
		
		return String.format(" Vehicle Model: %s\n Manufacturer: %s\n Tank Size: %.2f\n Top Speed: %d %s\n Number of Wheels: %d\n ------------", this.model, this.manufacturer, this.tankSize, this.topSpeed, this.speedUnits, this.numWheels);
		
		
	}

	
}
