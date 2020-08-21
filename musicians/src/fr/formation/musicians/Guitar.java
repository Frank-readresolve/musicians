package fr.formation.musicians;

public class Guitar extends Instrument implements StringInstrument {

    public Guitar(String name) {
	super(name);
    }

    @Override
    public String use() {
	return getName();
    }

    @Override
    public String makeNoise() {
	return "brrring";
    }
}
