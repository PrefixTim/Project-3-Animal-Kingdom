package animals.fish;

import animals.BirthType;

public class Goldfish extends Fish {
    public static final String DESCRIPTION ="a kind of fish";

    public Goldfish(int id, String name) {
        super(id, name, BirthType.LAYS_EGGS);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
