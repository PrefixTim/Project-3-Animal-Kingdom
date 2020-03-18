package animals.birds;

import animals.Animal;
import animals.BirthType;

public abstract class Bird extends Animal implements Winged {

    public Bird(int id, String name) {
        super(id, name, BirthType.LAYS_EGGS);
    }

    @Override
    public boolean isWarmBlooded() {
        return true;
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
