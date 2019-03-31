public class Flight {

    private Airplane airplane;
    private int flightNumber;
    private Location destination;
    private int availableTickets;


    public Flight(Airplane airplane, int flightNumber, Location destination) {
        this.airplane = airplane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableTickets = this.airplane.getCapacity();

    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public Airport getDestination() {
        return this.destination;
    }

    public int getAvailableTickets(){
        return this.availableTickets;
    }

    public void sellTicket(){
        if (this.availableTickets > 0){
            this.availableTickets -= 1;
        }
    }

}
