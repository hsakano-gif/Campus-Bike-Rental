/** Represents one bike in the campus rental system. */
public class Bike {
    private int id;
    private String model;
    private boolean availability = true;

    public Bike(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void rent() {
        availability = false;
    }

    public void returnBike() {
        availability = true;
    }
}
