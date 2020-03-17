public abstract class Bird extends Animal implements Winged{

    public Bird(int id, String name) {
        super(id, name, BirthType.LAYS_EGGS);
    }

    @Override
    public boolean isWarmBlooded() {
        return true;
    }

    @Override
    public String getDescription() {
        return "Birds are warm-blooded animals that have wings and lay eggs";
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
