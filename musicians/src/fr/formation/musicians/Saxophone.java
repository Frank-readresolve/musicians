package fr.formation.musicians;

//"IS A" vs "HAS A"
public class Saxophone extends Instrument implements WindInstrument {

    public Saxophone(String name) {
	super(name);
    }

    @Override
    public String use() {
	return getName();
    }

    @Override
    public String makeNoise() {
	return "fffff";
    }
}
