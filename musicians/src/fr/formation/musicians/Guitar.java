package fr.formation.musicians;

public class Guitar extends Instrument {

    public Guitar(String name) {
	super(name);
    }

    @Override
    public String use() {
	return getName();
    }
}
