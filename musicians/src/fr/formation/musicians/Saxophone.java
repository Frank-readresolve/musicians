package fr.formation.musicians;

public class Saxophone extends Instrument {

    public Saxophone(String name) {
	super(name);
    }

    @Override
    public String use() {
	return getName();
    }
}
