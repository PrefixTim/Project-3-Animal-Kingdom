package animals.mamal;

import animals.Endangered;

public class BlueWhale extends Whale  implements Endangered {
    private static final String BLUE_WHALE = "Blue Whale: a kind of whale that is endangered ";
    public BlueWhale(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return BLUE_WHALE;
    }

    @Override
    public void displayConservationInformation() {
        System.out.println("Endangered");
    }
}
