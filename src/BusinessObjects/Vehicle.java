package BusinessObjects;

import java.math.BigDecimal;
import java.util.HashMap;

public abstract class Vehicle {
	@Override
	public String toString() {
		return
				"Model: " + model +
				" | VinNumber: " + vinNumber +
				" | Color: " + color +
				" | MSRP: " + msrp +
				" | mpg City: " + mpgCity +
				" | mpg Highway: " + mpgHighway +
				" | Reserved: " + isReserved;
	}

	public Vehicle() {
		features = new HashMap<String, String>();
	}
	//model of specific vehicle
	public String model;
	//unique identifier for vehicle
	public String vinNumber;
	//vehicle paint color
	public String color;
	//Manufacturer Suggested Retail Price
	public BigDecimal msrp;
	//Miles that can be traveled per gallon city
	public int mpgCity;
	//Miles that can be traveled per gallon highway
	public int mpgHighway;
	//mapping of features 
	public HashMap<String,String> features;
	// indicates whether or not vehicle is in stock
	public boolean isReserved;
}
