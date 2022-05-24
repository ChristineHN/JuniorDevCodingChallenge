package Services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import BusinessObjects.Sedan;
import BusinessObjects.Suv;
import BusinessObjects.Vehicle;

/*
 * Mock data service. In a real application, we would probably pull our vehicle data from a database.
 */
public class MockDataService implements IDataService {

	@Override
	public List<Vehicle> loadVehicleData() {
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		Sedan jetta = new Sedan();

		jetta.model = "Jetta";
		jetta.vinNumber = "f3jfaf9j32lad";
		jetta.color = "white";
		jetta.msrp = new BigDecimal("17495.00");
		jetta.mpgCity = 23;
		jetta.mpgHighway = 30;
		jetta.isReserved = false;
		jetta.numberOfSeats = 5;
		
		vehicles.add(jetta);
		
		Sedan beatle = new Sedan();

		beatle.model = "Beatle";
		beatle.vinNumber = "a234faf9j32lad";
		beatle.color = "yellow";
		beatle.msrp = new BigDecimal("15235.00");
		beatle.mpgCity = 25;
		beatle.mpgHighway = 32;
		beatle.isReserved = false;
		beatle.numberOfSeats = 4;
		
		vehicles.add(beatle);
		
		Sedan artean = new Sedan();

		artean.model = "Artean";
		artean.vinNumber = "djrl320djalk";
		artean.color = "red";
		artean.msrp = new BigDecimal("25985.00");
		artean.mpgCity = 23;
		artean.mpgHighway = 28;
		artean.isReserved = false;
		artean.numberOfSeats = 5;
		
		vehicles.add(artean);
		
		Sedan jetta1 = new Sedan();

		jetta1.model = "Jetta";
		jetta1.vinNumber = "uk2saaj32lad";
		jetta1.color = "red";
		jetta1.msrp = new BigDecimal("17495.00");
		jetta1.mpgCity = 23;
		jetta1.mpgHighway = 30;
		jetta1.isReserved = false;
		jetta1.numberOfSeats = 5;
		
		vehicles.add(jetta1);
		
		Sedan beatle1 = new Sedan();

		beatle1.model = "Beatle";
		beatle1.vinNumber = "ikj3lsaf9j32lad";
		beatle1.color = "yellow";
		beatle1.msrp = new BigDecimal("15235.00");
		beatle1.mpgCity = 25;
		beatle1.mpgHighway = 32;
		beatle1.isReserved = false;
		beatle1.numberOfSeats = 4;
		
		vehicles.add(beatle1);
		
		Sedan artean1 = new Sedan();

		artean1.model = "Artean";
		artean1.vinNumber = "9ail320djalk";
		artean1.color = "black";
		artean1.msrp = new BigDecimal("25985.00");
		artean1.mpgCity = 23;
		artean1.mpgHighway = 28;
		artean1.isReserved = true;
		artean1.numberOfSeats = 5;
		
		vehicles.add(artean1);
		
		Suv tiguan = new Suv();
		
		tiguan.model = "Tiguan";
		tiguan.vinNumber = "219kjk1ljn1k";
		tiguan.color = "grey";
		tiguan.msrp = new BigDecimal("32985.00");
		tiguan.mpgCity = 20;
		tiguan.mpgHighway = 26;
		tiguan.isReserved = false;
		tiguan.allWheelDrive = true;
		tiguan.cargoCapacitySqft = 32;
		tiguan.towingCapacityLBs = 12000;
		
		vehicles.add(tiguan);
		
		Suv tiguan2 = new Suv();
		
		tiguan2.model = "Tiguan";
		tiguan2.vinNumber = "3129kjk1ljn1k";
		tiguan2.color = "black";
		tiguan2.msrp = new BigDecimal("32985.00");
		tiguan2.mpgCity = 20;
		tiguan2.mpgHighway = 26;
		tiguan2.isReserved = false;
		tiguan2.allWheelDrive = true;
		tiguan2.cargoCapacitySqft = 32;
		tiguan2.towingCapacityLBs = 12000;
		
		vehicles.add(tiguan2);
		
		return vehicles;
	}

}
