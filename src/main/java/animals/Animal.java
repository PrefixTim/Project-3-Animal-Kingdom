package animals;/* ADD THE EQUALS METHOD AND IMPLEMENT THE COMPARABLE INTERFACE */
/* MAKE NO OTHER CHANGES TO THIS FILE */

public abstract class Animal implements Comparable<Animal> {

    public static final String ANIMAL_DESCRIPTION = "animals.Animal";
    private int id;
    private String name;
    private BirthType birthType;

    public Animal(int id, String name, BirthType birthType) {
        this.id = id;
        this.name = name;
        this.birthType = birthType;
    }


    // information about birth type
    public final boolean laysEggs() {
        return birthType == BirthType.LAYS_EGGS;
    }

    public final boolean hasLiveBirth() {
        return birthType == BirthType.LIVE_BIRTH;
    }

    public final BirthType getBirthType() {
        return birthType;
    }

    // getters (no setters provided)
    public final int getId() {
        return id;
    }

    public final String getName() {
        return name;
    }

    //add equals method, equivalent if both name(ignore capitalization) and id are same


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return this.getId() == animal.getId() &&
                this.getName().equalsIgnoreCase(animal.getName());
    }

    //override compareTo method, Order name in alphabetic order
    @Override
    public int compareTo(Animal animal) {
        return this.name.compareTo(animal.name);
    }

    // toString method will create text with name, id, birth type, warm/cold blodded, and the description
    @Override
    public final String toString() {
        return name + " (id=" + id + "):\t" + birthType.toString() + "\t" +
                (isWarmBlooded() ? "Warm Blooded" : "Cold Blooded") + "\t" +
                getDescription();
    }

    // abstract methods to implement in child classes
    public abstract boolean isWarmBlooded();

    public abstract String getDescription();

}
