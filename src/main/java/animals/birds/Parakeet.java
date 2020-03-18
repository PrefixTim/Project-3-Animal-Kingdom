package animals.birds;

public class Parakeet extends Bird {
    public static final String DESCRIPTION = "a kind of bird";
    public Parakeet(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
