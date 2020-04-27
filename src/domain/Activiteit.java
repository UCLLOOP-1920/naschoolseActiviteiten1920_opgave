package domain;

import java.time.LocalDate;

public class Activiteit {
    private String naam;
    private LocalDate datum;

    /**
     * Maak activiteit aan met gegeven naam op gegeven datum
     *
     * @throws DomainException indien invoer niet geldig is
     */
    public Activiteit(String naam, LocalDate datum) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean equals(Object other) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Returnt true indien deze activiteit beschikbaar is voor gegeven persoon
     */
    public boolean isBeschikbaarVoorPersoon(Persoon persoon) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
