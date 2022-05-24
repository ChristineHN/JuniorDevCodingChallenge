package Services;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import BusinessObjects.Suv;
import BusinessObjects.Vehicle;

public class InventoryService {
	
	private List<Vehicle> currentInventory;
	
	public InventoryService(IDataService dataService) {
		currentInventory = dataService.loadVehicleData();
	}
	
	/*
	 * get all in stock vehicles
	 */
	public List<Vehicle> getCurrentInventory() {
		return currentInventory.stream().filter(v -> !v.isReserved).toList();
	}
	
	/*
	 * search for vehicles based on key attributes
	 */
	//TODO There is a bug in this code. It is not taking the "minMpg" into consideration 
	//when filtering. Add it to the appropriate section off the code 
	public List<Vehicle> searchVehicles(boolean isSuv, int minMpg, BigDecimal minPrice, BigDecimal maxPrice, HashMap<String,String> features){
		//filter based on criteria
		var filteredResults = currentInventory.stream().filter(v -> !v.isReserved && 
				((v instanceof Suv) == isSuv) && 
				v.msrp.compareTo(minPrice) >= 0 && v.msrp.compareTo(maxPrice) <= 0).toList();
		
		//filter based on features
		if(features != null) {
			for(Map.Entry<String,String> feature : features.entrySet()) {
				String key = feature.getKey();
				filteredResults = filteredResults.stream().filter(v -> v.features.get(key) == features.get(key)).toList();
			}
		}
		return filteredResults;
	}
	
	// TODO Create a method for reserving a vehicle
	// Hint: This doesn't need to do anything more than setting the appropriate property on the vehicle
}
