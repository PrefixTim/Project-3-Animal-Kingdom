package animals.mamal;

import animals.BirthType;
import animals.WaterDweller;

public class DuckbilledPlatypus extends Mammal implements WaterDweller {
    public static final String PLATYPUS_DESCRIPTION = " Duckbilled Platypus: a kind of mammal that lays eggs instead of giving birth to live young ";

    public DuckbilledPlatypus(int id, String name) {
        super(id, name, BirthType.LAYS_EGGS);
    }

    @Override
    public String getDescription() {
        return PLATYPUS_DESCRIPTION;
    }

    @Override
    public boolean breathesAir() {
        return true;
    }
}
