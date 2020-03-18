package animals.mamal;

public class BelugaWhale extends Whale {
    public static final String BELUGA_WHALE_DESCRIPTION = "Beluga Whale: a kind of whale ";

    public BelugaWhale(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return BELUGA_WHALE_DESCRIPTION;
    }
}
