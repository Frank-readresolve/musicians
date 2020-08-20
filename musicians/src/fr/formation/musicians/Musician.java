package fr.formation.musicians;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Musician { // AbstractMusician

    private String name; // Encapsulation stricte
    // private Instrument instrument; // Code mort

    private List<Instrument> instruments = new ArrayList<>();

    // On ne peut pas construire une classe abstraite
    // avec new
    /**
     * Creates a new musician with given name and instrument.
     *
     * @param name       the name of the musician
     * @param instrument an instrument
     * @throws NullPointerException if name or instrument is null
     */
    public Musician(String name, Instrument instrument) {
	// Defensive programming
	if (name == null) {
	    throw new NullPointerException("name cannot be null");
	}
	if (instrument == null) {
	    throw new NullPointerException("instrument cannot be null");
	}
	this.name = name;
	instruments.add(instrument);
    }

    /**
     * Creates a new musician with given name and instruments.
     *
     * @param name        the name of the musician
     * @param instruments 1 or more instruments
     * @throws NullPointerException if name or instruments is null; or
     *                              instruments is empty
     */
    public Musician(String name, Instrument... instruments) {
	// Programmation d�fensive, garantir la coh�rence des donn�es � la
	// construction
	if (name == null) { // Defensive programming
	    throw new NullPointerException("name cannot be null");
	}
	if (instruments == null) { // Defensive programming
	    throw new NullPointerException("instruments cannot be null");
	}
	if (instruments.length == 0) { // Defensive programming
	    throw new IllegalArgumentException("instruments cannot be empty");
	}
	this.name = name;
	for (Instrument instrument : instruments) {
	    add(instrument);
	}
    }

    // Bad constructor
    // instruments can be modified outside the class
    public Musician(String name, List<Instrument> instruments) {
	this.name = name;
	this.instruments = instruments; // Bad!!!
    }

    public void add(Instrument instrument) {
	// Programmation d�fensive, garantir la coh�rence des donn�es au
	// changement d'�tat de l'objet, pendant sa dur�e de vie
	Objects.requireNonNull(instrument, "instrument cannot be null");
	instruments.add(instrument);
    }

    public void play() {
	for (Instrument instrument : instruments) {
	    System.out.println(name + " is playing " + instrument.getName());
	}
    }
//    public Musician(String name, Object dummy) {
//	this.name = name;
//    }
//    public String getName() {
//	return name;
//    }
//
//    public Instrument getInstrument() {
//	return instrument;
//    }
    // M�thode sans corps, elle ne fait rien d'autre que de dire ce qu'elle doit
    // faire
    // La 1ere classe concrete qui �tend Musician doit impl�menter la m�thode
    // public abstract void play();

    public void toto() {
	System.out.println("toto");
    }
}
