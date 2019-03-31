import java.util.ArrayList;

public class Airport {

    private Location location;
    private ArrayList<Airplane> hanger;

    public Airport(Location location) {

        this.location = location;
        this.hanger = new ArrayList<>();
    }

    public Location getAirportLocation() {
        return this.location;
    }

    public int hangarSize() {
        return this.hanger.size();
    }

    public void addAirplane(Airplane airplane) {
        this.hanger.add(Airplane);
    }



}
