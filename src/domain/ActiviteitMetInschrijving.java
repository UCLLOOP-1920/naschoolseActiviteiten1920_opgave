package domain;

import java.time.LocalDate;
import java.util.List;

public class ActiviteitMetInschrijving {
    private List<Persoon> personen;

    public ActiviteitMetInschrijving(String naam, LocalDate datum) {
    }

    /**
     * Schrijf gegeven persoon in voor deze activiteit
     *
     * @throws DomainException indien de gegeven persoon niet ingeschreven kan worden
     */
    public void schrijfIn(Persoon persoon) {
    }

    /**
     * Returnt true indien gegeven persoon ingeschreven is voor deze activiteit
     */
    public boolean isIngeschreven(Persoon persoon) {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }
}
