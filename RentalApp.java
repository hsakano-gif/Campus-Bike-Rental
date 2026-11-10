/** Client program for the campus bike rental system. */
public class RentalApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Campus Bike Rental System!");
        
        // TODO 1: Create two RentalStation objects.
        RentalStation misterGorton = new RentalStation("misterGorton");

        RentalStation missGorton = new RentalStation("missGorton");

        // TODO 2: Create at least three Bike objects.
        Bike goat = new Bike(6741, "suzuki");

        Bike goatTwo = new Bike(1467, "honda");

        Bike goatThree = new Bike(7614, "lexus");

        // TODO 3: Rent a bike from the first station.
        misterGorton.rentBike(goat);
        // TODO 4: Attempt to rent the same bike again.
        misterGorton.rentBike(goat);
        // TODO 5: Rent a different bike from the second station.
        missGorton.rentBike(goatTwo);
        // TODO 6: Return the first bike and rent it again.
        misterGorton.returnBike(goat);
        misterGorton.rentBike(goat);

        // TODO 7: Print the cost of a three-hour rental.
        misterGorton.calculateCost(3);

        // TODO 8: Print the total successful rentals using
        System.out.println("$" + RentalStation.getTotalRentals() + " is how much it costs.");
    } 
}

/*
PART D — Written Responses

1. Why is totalRentals static, but name is not?
Answer: Because name is used for all the objects made

2. What would happen if totalRentals were not static?
Answer: The totalRentals would restart from zero.

3. When rentBike(Bike bike) is called, is a new Bike object created? Explain.
Answer: No, because you have to define a new object before. 

4. Why is HOURLY_RATE declared final?
Answer: Because it is finalized and cannot be changed.
*/
