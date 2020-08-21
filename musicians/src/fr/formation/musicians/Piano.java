package fr.formation.musicians;

public class Piano extends Instrument implements StringInstrument {

    public Piano(String name) {
	super(name);
    }

    @Override
    public String use() {
	return getName();
    }

    @Override
    public String makeNoise() {
	return "ting";
    }
}
