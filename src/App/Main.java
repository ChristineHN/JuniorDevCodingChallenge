package App;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import BusinessObjects.Vehicle;
import Services.IDataService;
import Services.InventoryService;
import Services.MockDataService;

public class Main {

	static InventoryService _inventoryService;
	/*
	 * Our super old and outdated command line tool for tracking the vehicles at our Volkswagen dealership!
	 */
	public static void main(String[] args) {
		IDataService dataService = new MockDataService();
		
		_inventoryService = new InventoryService(dataService);
		
		int selection = 0;
		Scanner userInputScanner = new Scanner(System.in);
		
		do {
			
			//Provide user with menu
			System.out.println("Please select an option:");
			
			System.out.println("1. List All Inventory");
			System.out.println("2. Search For Vehicle");
			System.out.println("3. Set Vehicle as Reserved");
			System.out.println("4. Exit");
		
			//Read the input from the user
			 
			String userInput = userInputScanner.nextLine();
			selection = Integer.parseInt(userInput);
						
			//handle user selection
			switch(selection) {
				case 1:
					printInventory();
					break;
				case 2:
					searchInventory();
					break;
				case 3:
					reserveVehicle();
					break;
				case 4:
				default:
					System.out.println("Application closing");
					userInputScanner.close();
					return;
			}
			
		} while (selection != 0);
	}
	
	/*
	 * Provide UI for reserving a vehicle
	 */
	private static void reserveVehicle() {
		Scanner userInputScanner = null;
		
		try {
			userInputScanner = new Scanner(System.in);
			
			System.out.println("Please enter the vin number of the vehicle you wish to reserve: ");
			String vinNumber = userInputScanner.nextLine();
			
			// TODO Call the method you created on the InventoryService to reserve a vehicle
		}
		catch(Exception e) {
			System.out.println("Error reserving vehicle inventory: " + e.getMessage());
		}
	}

	/*
	 * Provide UI to present users with options for search
	 */
	private static void searchInventory() {
		
		Scanner userInputScanner = null;
		
		try {
			userInputScanner = new Scanner(System.in);
			
			System.out.println("Are you looking for an SUV? (y/n)");
			boolean isSuv = userInputScanner.nextLine().compareTo("y") == 0;
			
			System.out.println("Enter min price:");
			BigDecimal minPrice = new BigDecimal(userInputScanner.nextLine().trim());
			
			System.out.println("Enter max price:");
			BigDecimal maxPrice = new BigDecimal(userInputScanner.nextLine().trim());
			
			System.out.println("Enter min MPG:");
			int minMPG = Integer.parseInt(userInputScanner.nextLine());
			
			List<Vehicle> vehicles = _inventoryService.searchVehicles(isSuv, minMPG, minPrice, maxPrice, null);
			
			printVehicles(vehicles);
		}
		catch(Exception e) {
			System.out.println("Error searching inventory: " + e.getMessage());
		}
	}

	
	/*
	 * Print current inventory to screen
	 */
	private static void printInventory() {
		List<Vehicle> vehicles = _inventoryService.getCurrentInventory();

		printVehicles(vehicles);
	}
	
	private static void printVehicles(List<Vehicle> vehicles) {
		for(Vehicle vehicle : vehicles) {
			System.out.print("Model: " + vehicle.model + "  |  ");
			System.out.print("Color: " + vehicle.color + "  |  ");
			System.out.print("Price: " + vehicle.msrp + "  |  ");
			System.out.print("Vin Number: " + vehicle.vinNumber);
			System.out.println();
			System.out.println();
		}
	}
}
