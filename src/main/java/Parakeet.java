public class Parakeet extends Bird {
    public Parakeet(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return "a kind of bird";
    }
}
