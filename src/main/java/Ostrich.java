public class Ostrich extends Bird {
    public Ostrich(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return "a flightless bird";
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
