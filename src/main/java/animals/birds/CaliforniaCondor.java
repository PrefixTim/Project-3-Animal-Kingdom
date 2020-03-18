package animals.birds;

import animals.Endangered;

public class CaliforniaCondor extends Bird implements Endangered {
    public static final String DESCRIPTION = "a kind of bird that is endangered";

    public CaliforniaCondor(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void displayConservationInformation() {
        System.out.println("This is an endangered bird");
    }
}
