package BusinessObjects;

/*
 * Represents a standard 2 or 4 door car
 */
public class Sedan extends Vehicle {
	@Override
	public String toString() {
		return super.toString() + " | Number of Seats: " + numberOfSeats +"LBs";
	}

	public int numberOfSeats;
}
