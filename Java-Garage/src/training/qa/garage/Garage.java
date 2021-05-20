package training.qa.garage;

import java.util.ArrayList;

import training.qa.garage.vehicles.Car;
import training.qa.garage.vehicles.Motorcycle;
import training.qa.garage.vehicles.Ship;

public class Garage {
	
	private ArrayList<Vehicle> listOfVehicles;
	
	public Garage() {
		this.listOfVehicles = new ArrayList<Vehicle>();
	}
	
	public Garage(ArrayList<Vehicle> vehicles) {
		this.listOfVehicles = vehicles;
	}
	
	public void emptyGarage() {
		this.listOfVehicles = new ArrayList<Vehicle>();
	}
	
	public ArrayList<String> getVehicles() {
		
		ArrayList<String> names = new ArrayList<String>();
		
		for (Vehicle v: this.listOfVehicles) {
			names.add(v.getModel());
		}
		
		return names;
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.listOfVehicles.add(vehicle);
	}
	
	public void removeVehicleById(int vehicleId) {
		
		int indexToRemove = 0;
		boolean found = false;
		
		for (int i = 0; i < this.listOfVehicles.size(); i++) {
			
			if (this.listOfVehicles.get(i).getVehicleId() == vehicleId) {
				found = true;
				indexToRemove = i;
				break;
			}
		}
		
		if (found) {
			this.listOfVehicles.remove(indexToRemove);
		}
		
	}
	
	public void removeVehicleByType(int vehicleType) {
		
		ArrayList<Integer> indicesToBeRemoved= new ArrayList<Integer>();
	
		
		for (int i = 0; i < this.listOfVehicles.size(); i++) {
			
			if (this.listOfVehicles.get(i).getType().equals(vehicleType)) {
				indicesToBeRemoved.add(i);
			}
		}
		
		for (int i: indicesToBeRemoved) {
			this.listOfVehicles.remove(i);
		}
		
	}
	
	
	public void calculateBill() {
		
		ArrayList<Double> billPerVehicle = new ArrayList<Double>();
		ArrayList<String> vehicleName = new ArrayList<String>();
		
		
		for (Vehicle v: this.listOfVehicles) {
			
			vehicleName.add(v.getModel());
			
			if (v.getNumWheels() == 0) {
				
				Ship x = (Ship) v;
				
				if (x.getLineOfBusiness().equals("Cruise")) {
					billPerVehicle.add((double) (10000 * x.getYearOfPurchase()));
				}	
				
				else {
					billPerVehicle.add( (double) (5000 * x.getYearOfPurchase()));
				}
				
			}
			
			else if (v.getNumWheels() == 2) {
				
				Motorcycle x = (Motorcycle) v;
				
				
				if (x.getIsCustom()) {
					billPerVehicle.add(x.getPrice() * 3);
				}
				
				else {
					billPerVehicle.add(x.getPrice() * 2);
				}
				
			}
			
			else if (v.getNumWheels() == 4) {
				
				Car x = (Car) v;
				
				if (x.getIsBrandNew()) {
					billPerVehicle.add(1500.00);
				}
				
				else {
					billPerVehicle.add(500.00);
				}
				
			}
			
			else {
	
				billPerVehicle.add(v.getTopSpeed() * 0.5);
				
			}
			
			
		}
		
		
		for (int i = 0; i < vehicleName.size(); i++) {
			System.out.println(String.format("Vehicle Name:  %s, Total Bill: %.2f", vehicleName.get(i), billPerVehicle.get(i)));
		}
		
		
		
		
	}
	

}

