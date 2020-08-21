package fr.formation.musicians;

public abstract class Instrument /*
				  * implements WindInstrument, StringInstrument
				  */ {

    private String name;

    public Instrument(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public abstract String use();
}
