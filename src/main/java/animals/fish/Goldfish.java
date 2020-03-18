package animals.fish;

public class Goldfish extends Fish {
    public static final String DESCRIPTION = "a kind of fish";

    public Goldfish(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
