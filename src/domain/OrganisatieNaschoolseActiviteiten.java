package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrganisatieNaschoolseActiviteiten {
    private List<Activiteit> activiteiten;

    public OrganisatieNaschoolseActiviteiten() {
        this.activiteiten = new ArrayList<>();
    }

    /**
     * Voeg gegeven activiteit toe aan lijst met activiteiten
     * @throws DomainException indien gegeven activiteit null is
     * @throws DomainException indien gegeven activititei reeds geregistreerd is
     * @param activiteit
     */
    public void voegActiviteitToe(Activiteit activiteit) {
    }

    /**
     * Schrijft gegeven persoon in voor gegeven activiteit
     * @throws DomainException indien gegeven activiteit niet bestaat
     * @throws DomainException indien inschrijving voor gegeven activiteit niet mogelijk is
     */
    public void schrijfIn(Persoon persoon, Activiteit activiteit) {
    }

    /**
     * Geef lijst met geregistreerde wedstrijden
     */
    public List<Wedstrijd> geefWedstrijden() {
        return null;
    }

    /**
     * Geef activiteiten op gegeven dag waarop gegeven persoon zich kan inschrijven
     * @throws DomainException indien gegeven invoer niet geldig is
     */
    public List<Activiteit> geefActiviteitenVoorPersoonOpDag(Persoon persoon, LocalDate dag) {
        return null;
    }
}
