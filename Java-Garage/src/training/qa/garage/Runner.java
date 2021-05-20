package training.qa.garage;
import java.util.*;
import training.qa.garage.vehicles.*;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
		
		Ship titanic = new Ship("RMS Titanic", "RMS", 10000000, 23, "Knots", 0, "Cruise", "White line", 1800, "water", 1208301928);
		Car ferrari = new Car("Italia 458", "Ferrari", 10, 300, "Km/h", 4, false, true, "Enzo", "ground", 123143453);
		Motorcycle f900 = new Motorcycle("F900", "BMW",2, 200, "Km/h", 2, false, "N/A", 15999.00, "ground", 12335432);
		
		
		listOfVehicles.add(titanic);
		listOfVehicles.add(ferrari);
		listOfVehicles.add(f900);
		
       //	To be added then removed
		Car camry = new Car("Camry", "Toyota", 3, 180, "Km/h", 4, false, true, "Bob", "ground", 1231962453);
		Motorcycle harley = new Motorcycle("Harley", "Harley Davidson", 2, 100, "Km/h", 2, true, "Ana", 10000.00, "ground", 1333333);
		
		Garage garage = new Garage();
		
		garage.addVehicle(titanic);
		garage.addVehicle(ferrari);
		garage.addVehicle(f900);
		garage.addVehicle(camry);
		garage.addVehicle(harley);
		
		System.out.println(garage.getVehicles());
		
		System.out.println("");
		System.out.println("---------");
		System.out.println("");
		
		garage.removeVehicleById(1333333);
		System.out.println("After removing: " + garage.getVehicles());
		
		
		System.out.println("");
		System.out.println("---------");
		System.out.println("");
		
		
		garage.calculateBill();
		
	}

}
