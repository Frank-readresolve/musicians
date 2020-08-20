package fr.formation.musicians;

public class Guitarist /* extends Musician */ {

    public Guitarist(String name, Instrument instrument) {
	// super(name, instrument);
    }

    // @Override
    public void play() {
	// getInstrument().getName() => delegation
	//
	// System.out.println(
	// getName() + " is playing " + getInstrument().getName());
    }

    // @Override
    public void toto() {
	System.out.println("toto is a guitarist");
    }

    public void foo() {
	System.out.println("foo invoked");
    }
}
