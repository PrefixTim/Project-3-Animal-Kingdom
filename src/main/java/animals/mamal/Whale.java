package animals.mamal;

import animals.WaterDweller;

public abstract class Whale extends Mammal implements WaterDweller {
    public Whale(int id, String name) {
        super(id, name);
    }

    @Override
    public boolean breathesAir() {
        return true;
    }
}
