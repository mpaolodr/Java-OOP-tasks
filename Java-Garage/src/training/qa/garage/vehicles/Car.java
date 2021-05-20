package training.qa.garage.vehicles;

import training.qa.garage.Vehicle;

public class Car extends Vehicle {

	private boolean isAutomatic;
	private boolean isBrandNew;
	private int currentSpeed = 0;

	public Car(String model, String manufacturer, int tankSize, int topSpeed, String speedUnits, int numWheels, boolean isAutomatic,
			boolean isBrandNew, String owner) {
		super(model, manufacturer, tankSize, topSpeed, speedUnits, numWheels, owner);
		this.isAutomatic = isAutomatic;
		this.isBrandNew = isBrandNew;
	}
	
	public boolean getIsAuto() {
		return this.isAutomatic;
	}
	
	public boolean getIsBrandNew() {
		return this.isBrandNew;
	}

	public void accelerate() {
		if (this.currentSpeed + 20 <= this.getTopSpeed()) {

			this.currentSpeed += 20;
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

		System.out.println("BEEEP! BEEEPPP!!!!");

	}

	public void honk(String custom) {
		System.out.println(String.format("%s! %s!!!!!!!", custom.toUpperCase(), custom.toUpperCase()));
	}

	public void slow() {

		if (this.currentSpeed > 0) {
			this.currentSpeed -= 20;
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
