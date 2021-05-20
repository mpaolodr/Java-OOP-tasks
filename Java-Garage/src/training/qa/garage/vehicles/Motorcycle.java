package training.qa.garage.vehicles;

import training.qa.garage.Vehicle;

public class Motorcycle extends Vehicle {

	private boolean isCustom;
	private int currentSpeed = 0;
	private double price = 0;

	public Motorcycle(String model, String manufacturer, int tankSize, int topSpeed, String speedUnits, int numWheels,
			boolean isCustom, String owner, double originalPrice, String type, int id) {
		super(model, manufacturer, tankSize, topSpeed, speedUnits, numWheels, owner, type, id);
		this.isCustom = isCustom;
		this.price = originalPrice;

	}

	public double getPrice() {
		return this.price;
	}

	public boolean getIsCustom() {
		return this.isCustom;
	}

	public void setIsCustom() {
		this.isCustom = true;
	}

	public void accelerate() {

		if (this.currentSpeed + 10 <= this.getTopSpeed()) {

			this.currentSpeed += 10;
		}

		else {
			this.currentSpeed = this.getTopSpeed();

		}
	}

	public void accelerate(int newSpeed) {
		if (this.currentSpeed + newSpeed <= this.getTopSpeed()) {

			this.currentSpeed += newSpeed;
		}

		else {
			this.currentSpeed = this.getTopSpeed();

		}
	}

	public void honk() {

		System.out.println("beep! beeepp!!!");

	}

	public void honk(String custom) {
		System.out.println(String.format("%s! %s!!!!!!!", custom, custom));
	}

	public void slow() {

		if (this.currentSpeed > 0) {
			this.currentSpeed -= 10;
		}

		else {
			this.currentSpeed = 0;
		}
	}

	public void slow(int newSpeed) {

		if (this.currentSpeed - newSpeed > 0) {
			this.currentSpeed -= newSpeed;
		}

		else {
			this.currentSpeed = 0;
		}
	}

}
