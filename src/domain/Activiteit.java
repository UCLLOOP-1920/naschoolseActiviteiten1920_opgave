package domain;

import java.time.LocalDate;

public class Activiteit {
    private String naam;
    private LocalDate datum;

    /**
     * Maak activiteit aan met gegeven naam op gegeven datum
     * @throws DomainException indien invoer niet geldig is
     */
    public Activiteit(String naam, LocalDate datum) {
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object other) {
        return true;
    }

    /**
     * Returnt true indien deze activiteit beschikbaar is voor gegeven persoon
     */
    public boolean isBeschikbaarVoorPersoon(Persoon persoon) {
        return true;
    }

}
