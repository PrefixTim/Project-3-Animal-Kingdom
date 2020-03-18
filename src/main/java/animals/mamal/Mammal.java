package animals.mamal;

import animals.Animal;
import animals.BirthType;

public abstract class Mammal extends Animal {
    private static final boolean WARM_BLOODED = true;

    public Mammal(int id, String name) {
        super(id, name, BirthType.LIVE_BIRTH);
    }

    @Override
    public boolean isWarmBlooded() {
        return WARM_BLOODED;
    }
}
