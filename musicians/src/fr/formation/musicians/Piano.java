package fr.formation.musicians;

public class Piano extends Instrument {

    public Piano(String name) {
	super(name);
    }

    @Override
    public String use() {
	return getName();
    }
}
