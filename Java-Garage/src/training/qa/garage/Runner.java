package training.qa.garage;
import java.util.*;
import training.qa.garage.vehicles.*;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
		
		Ship titanic = new Ship("RMS Titanic", "RMS", 10000000, 23, "Knots", 0, "Cruise", "White line");
		Car ferrari = new Car("Italia 458", "Ferrari", 10, 300, "Km/h", 4, false, true, "Enzo");
		
		
		listOfVehicles.add(titanic);
		listOfVehicles.add(ferrari);
		
		// check if vehicles are correctly added
		for (Vehicle v: listOfVehicles) {
			System.out.println(v.getCompleteDetails());
		}
	}

}
