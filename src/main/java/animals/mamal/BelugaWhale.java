package animals.mamal;

import animals.Endangered;

public class BelugaWhale extends Whale {
    private static final String BELUGA_WHALE_DESCRIPTION = "Beluga Whale: a kind of whale ";

    public BelugaWhale(int id, String name) {
        super(id, name);
    }

    @Override
    public String getDescription() {
        return BELUGA_WHALE_DESCRIPTION;
    }
}
