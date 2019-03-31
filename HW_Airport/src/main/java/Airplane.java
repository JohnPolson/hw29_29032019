import java.util.ArrayList;

public class Airplane {

    private Model model;
    private Airline airline;
    private ArrayList<Passenger> passengers;

    public Airplane (Model model, Airline airline) {
        this.model = model;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public Airplane getModel() {
        return this.model;
    }

    public Airplane getAirline() {
        return this.airline;
    }

    public Airplane getPassengerCount() {
        return this.passengers.size();
    }

    public int getCapacity(){
        return this.model.capacity;
    }

}
