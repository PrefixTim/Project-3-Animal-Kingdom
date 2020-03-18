package animals.fish;

import animals.BirthType;
import animals.Endangered;

public class GreatWhiteShark extends Fish implements Endangered {
    public static final String DESCRIPTION = "a kind of fish that is endangered; a fish that gives birth to live young " +
            "instead of laying eggs";

    public GreatWhiteShark(int id, String name) {
        super(id, name, BirthType.LIVE_BIRTH);

    }

    @Override
    public void displayConservationInformation() {
        System.out.println("This is an endangered fish");
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
