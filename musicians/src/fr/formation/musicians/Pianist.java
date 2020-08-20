package fr.formation.musicians;

public class Pianist /* extends Musician */ {

    public Pianist(String name, Instrument instrument) {
	// Appel au constructeur parent avec la même signature
	// Signature: nom (const. ou methode, arguments => ordre, nombre, type)
	// super(name, instrument);
    }

    // @Override
    public void play() {
	// ici super est optionel
	// System.out.println(
	// super.getName() + " is playing " + getInstrument().getName());
    }
}
