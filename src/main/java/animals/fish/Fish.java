package animals.fish;

import animals.Animal;
import animals.BirthType;

public abstract class Fish extends Animal implements WaterDweller {
    public Fish(int id, String name, BirthType birthType) {
        super(id, name, BirthType.LAYS_EGGS);
    }

    @Override
    public boolean breathesAir() {
        return false;
    }

    @Override
    public boolean isWarmBlooded() {
        return false;
    }

}
