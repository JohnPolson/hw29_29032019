public enum Airline {

    LH("Lufthansa"),
    FR("Ryanair"),
    BA("British Airways"),
    KL("KLM"),
    U2("EasyJet"),
    TRK("Turkish Airlines"),
    AFL("Aeroflot"),
    UA("United Airlines");

    private final String name;

    Airline(String name){
        this.name = name;
    }

    public String getAirlineName() {
        return this.name;
    }

}
