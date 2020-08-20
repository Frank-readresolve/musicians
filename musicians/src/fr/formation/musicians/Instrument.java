package fr.formation.musicians;

public abstract class Instrument {

    private String name;

    public Instrument(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public abstract String use();
}
