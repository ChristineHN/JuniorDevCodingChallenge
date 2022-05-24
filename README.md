## Car Dealership

This is our very bare-bones/buggy application for managing vehicles at a car dealership. Don't worry, the developer who wrote this terrible code was fired. We are hoping you can help fix some things.


## TODOs

1. There is an error in the code for searching vehicles. The method in the `InventoryService` take does not filter based on the specified minimum miles per gallon (minMpg), even though the user has the option to add it. Add the necessary functionality to the filter.
2. One of the main menu options is to reserve a vehicle. This functionality was never added to the inventory service. Add it and make sure it is called from the main application code.
3. There is a method to print out the vehicle data in the main application code. It would make sense move that logic to the `Vehicle` class as a `toString()` method. 
4. Our dealership is going to expand beyond sedans and suvs. We want to start selling vans as well. Add a new class for vans. The vans share the same properties as other vehicles, with the exception they have properties indicating if it comes equipt with a sun roof and a built in screen for the back seats.


