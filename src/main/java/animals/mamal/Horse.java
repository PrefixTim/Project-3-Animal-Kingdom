package animals.mamal;

public class Horse extends Mammal {
    public static final String HORSE_DESCRIPTION = "Horse: a kind of mammal ";

    public Horse(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return HORSE_DESCRIPTION;
    }
}
