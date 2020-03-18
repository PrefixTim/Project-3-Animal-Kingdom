package animals.mamal;

import animals.Endangered;

public class BlueWhale extends Whale implements Endangered {
    public static final String BLUE_WHALE_DESCRIPTION = "Blue Whale: a kind of whale that is endangered ";

    public BlueWhale(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return BLUE_WHALE_DESCRIPTION;
    }

    @Override
    public void displayConservationInformation() {
        System.out.println("Endangered");
    }
}
