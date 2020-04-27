package domain;

import java.time.LocalDate;
import java.util.List;

public class ActiviteitMetInschrijving {
    private List<Persoon> personen;

    public ActiviteitMetInschrijving(String naam, LocalDate datum) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Schrijf gegeven persoon in voor deze activiteit
     *
     * @throws DomainException indien de gegeven persoon niet ingeschreven kan worden
     */
    public void schrijfIn(Persoon persoon) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Returnt true indien gegeven persoon ingeschreven is voor deze activiteit
     */
    public boolean isIngeschreven(Persoon persoon) {
        throw new UnsupportedOperationException("Not yet implemented");

    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
