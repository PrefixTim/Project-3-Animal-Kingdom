package animals.birds;

public class Ostrich extends Bird {
    public static final String DESCRIPTION = "a flightless bird";

    public Ostrich(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
