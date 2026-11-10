/** A station that rents Bike objects. */
public class RentalStation {
    private static final double HOURLY_RATE = 8.00;
    // static to let pc know it is used every places
    private static int totalRentals = 0;
    private String name;

    public RentalStation(String name) {
        this.name = name;
    }

    public void rentBike(Bike bike) {
        if (bike.isAvailable() == true){
            System.out.println("ID: " + bike.getId() + " is available.");
            bike.rent();
            totalRentals++;
        } else{
            System.out.println("ID: " + bike.getId() + " is not available");
        }
    }

    public void returnBike(Bike bike) {
        bike.returnBike();
    }

    public double calculateCost(int hours) {
        return HOURLY_RATE * hours;
    }

    public static int getTotalRentals() {
        return totalRentals;
    }
}
