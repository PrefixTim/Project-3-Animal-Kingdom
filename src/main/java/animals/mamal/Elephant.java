package animals.mamal;

import animals.Endangered;

public class Elephant extends Mammal implements Endangered {
    private static final String ELEPHANT_DESCRIPTION = "Elephant: an endangered mammal";

    public Elephant(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return ELEPHANT_DESCRIPTION;
    }

    @Override
    public void displayConservationInformation() {
        System.out.println(" an endangered");
    }
}
