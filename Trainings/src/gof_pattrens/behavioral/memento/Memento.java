package gof_pattrens.behavioral.memento;

public class Memento {              //
    private final String country;
    private final int partyYear;

    public Memento(String country, int partyYear) {
        this.country = country;
        this.partyYear = partyYear;
    }

    public String getCountry() {
        return country;
    }

    public int getPartyYear() {
        return partyYear;
    }
}
