package animals;

/* MAKE NO CHANGES TO THIS FILE */
public enum BirthType {

    LIVE_BIRTH("Live Birth"), LAYS_EGGS("Lays Eggs");

    private String description;

    BirthType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }

}
