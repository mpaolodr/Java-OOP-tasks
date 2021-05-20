package training.qa.garage;

import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> listOfVehicles;
	
	public Garage(ArrayList<Vehicle> vehicles) {
		this.listOfVehicles = vehicles;
	}
	
	public ArrayList<String> getVehicles() {
		
		ArrayList<String> names = new ArrayList<String>();
		
		for (Vehicle v: this.listOfVehicles) {
			names.add(v.getModel());
		}
		
		return names;
	}
	

}

