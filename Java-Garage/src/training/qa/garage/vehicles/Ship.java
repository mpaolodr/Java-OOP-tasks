package training.qa.garage.vehicles;

import training.qa.garage.Vehicle;

public class Ship extends Vehicle {

	private String lineOfBusiness;
	private int currentSpeed;
	private boolean isSailing;
	private int yearOfPurchase;

	public Ship(String model, String manufacturer, int tankSize, int topSpeed, String speedUnits, int numWheels,
			String lineOfBusiness, String owner, int yearOfPurchase, String type, int id) {
		super(model, manufacturer, tankSize, topSpeed, speedUnits, numWheels, owner, type, id);
		this.lineOfBusiness = lineOfBusiness;
		this.yearOfPurchase = yearOfPurchase;
	}

	public int getYearOfPurchase() {
		return this.yearOfPurchase;
	}

	public String getLineOfBusiness() {
		return this.lineOfBusiness;
	}

	public void setLineOfBusiness(String newLineOfBusiness) {
		this.lineOfBusiness = newLineOfBusiness;
	}

	public void accelerate() {

		if (this.currentSpeed + 500 <= this.getTopSpeed()) {
			this.currentSpeed += 500;
		}

		else {
			this.currentSpeed = this.getTopSpeed();
		}

	}

	public void slow() {

		if (this.currentSpeed - 500 >= 0) {
			this.currentSpeed -= 500;
		}

		else {
			this.currentSpeed = 0;
		}

	}

	public void honk() {
		System.out.println("hooonnnkkkk!! hooonkkkkk!!");
	}

	public void setisSailing() {
		this.isSailing = !this.isSailing;
	}

}
