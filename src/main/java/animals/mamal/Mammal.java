package animals.mamal;

import animals.Animal;
import animals.BirthType;

public abstract class Mammal extends Animal {
    public static final boolean WARM_BLOODED = true;

    public Mammal(int id, String name) {
        this(id, name, BirthType.LIVE_BIRTH);
    }

    public Mammal(int id, String name, BirthType laysEggs) {
        super(id, name, laysEggs);
    }

    @Override
    public boolean isWarmBlooded() {
        return WARM_BLOODED;
    }
}
