public enum Location {

    EDI("Edinburgh Airport", "Scotland"),
    GLA("Glasgow Airport", "Scotland"),
    LHR("London Heathrow Airport", "England"),
    DUB("Dublin Airport", "Ireland"),
    AMS("Amsterdam Airport Schiphol", "Netherlands"),
    FRA("Frankfurt Airport", "Germany");

    private final String name;
    private final String country;

    Location(String name, String country){
        this.name = name;
        this.country = country;
    }

    public String getAirportName(){
        return this.name;
    }

    public String getAirportCountry() {
        return this.country;
    }



}
