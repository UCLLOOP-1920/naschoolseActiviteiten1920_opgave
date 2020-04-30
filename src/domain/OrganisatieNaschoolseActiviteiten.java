package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrganisatieNaschoolseActiviteiten {
    private List<Activiteit> activiteiten;

    public OrganisatieNaschoolseActiviteiten() {
        this.activiteiten = new ArrayList<>();
    }

    public void voegActiviteitToe(Activiteit activiteit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void schrijfIn(Persoon persoon, Activiteit activiteit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public List<Wedstrijd> geefWedstrijden() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public List<Activiteit> geefActiviteitenVoorPersoonOpDag(Persoon persoon, LocalDate dag) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public List<Activiteit> verwijderActiviteitenOpDatum(LocalDate datum) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int geefAantalGeregistreerdeActiviteiten(){
        return activiteiten.size();
    }

}
