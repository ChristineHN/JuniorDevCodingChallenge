package BusinessObjects;

/*
 * Represents an SUV style vehicle 
 * 
 */
public class Suv extends Vehicle {
	@Override
	public String toString() {
		return super.toString()+
				" | Towing Capacity: " + towingCapacityLBs + "LBs" +
				" | Cargo Capacity: " + cargoCapacitySqft + "sqft" +
				" | AWD: " + allWheelDrive +
				" | 4 Wheel Drive: " + fourWheelDrive;
	}

	//SUVs towing capacity
	public int towingCapacityLBs;
	//SUVs total cargo space
	public int cargoCapacitySqft;
	// indicates if has all wheel drive
	public boolean allWheelDrive;
	// indicates if has four wheel drive
	public boolean fourWheelDrive;
}
