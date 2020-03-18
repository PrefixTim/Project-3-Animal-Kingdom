package animals.birds;

import animals.Endangered;

public class CaliforniaCondor extends Bird implements Endangered {
    public CaliforniaCondor(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return "a kind of bird that is endangered";
    }

    @Override
    public void displayConservationInformation() {
        System.out.println("1000 remains");
    }
}
