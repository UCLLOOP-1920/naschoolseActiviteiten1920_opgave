package domain;

public abstract class Sport {
    String naam;

    /**
     * Maak sport met gegeven naam
     *
     * @throws DomainException indien invoer niet geldig is
     */
    public Sport(String naam) {
    }

    @Override
    public String toString() {
        return "";
    }

}
