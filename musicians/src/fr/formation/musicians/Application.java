package fr.formation.musicians;

import java.util.ArrayList;
import java.util.List;

/**
 * Concepts fondamentaux orient� objet:
 * <ul>
 * <li>Classe: donn�es + op�rations, d�finition de type
 * <li>Objet: instance d'une classe avec un �tat sp�cifique
 * <li>Typage
 * <li>Encapsulation
 * <li>Composition
 * <li>H�ritage
 * <li>Classes abstraites vs concr�tes
 * <li>Classes abstraites, des classes incompl�tes, une partir de
 * l'impl�mentation
 * <li>Red�finition de m�thodes, (re)d�fini une m�thode abstraite, red�fini une
 * m�thode concr�te
 * <li>Polymorphisme
 * <li>Etat (state) : immuable (string) vs muable (m�tier)
 * </ul>
 */
//Langages typ�es: doit y avoir compatibilit� de type entre le type de
// la variable et sa valeur (objet, instance)
// List<> => g�n�ricit�
public class Application {

    private String instanceField = "not static";

    // Toutes les instances acc�dent aux champs de classe
    private static String classField = "static";

    // Toutes les instances acc�dent aux m�thodes de classe (static)
    // Les m�thodes de classe n'acc�dent pas aux champs d'instance
    public static void main(String[] args) {
	List<StringInstrument> stringInstruments = new ArrayList<>();
	// stringInstruments.add(new Saxophone(""));
	stringInstruments.add(new Guitar("String Guitar"));
	//
	Instrument guitar = new Guitar("guitar");
	Instrument piano = new Piano("piano");
	Instrument saxo = new Saxophone("saxophone");
	List<Musician> musicians = new ArrayList<>();
	musicians.add(new Musician("Geo", piano, saxo));
	// Instrument[] instruments = { null }; // {guitar};
//	musicians.add(new Musician("Laurent", guitar));
//	musicians.add(new Musician("India", saxo, guitar));
	play(musicians);
	// Bad:
//	List<Instrument> instruments = new ArrayList<>();
//	instruments.add(guitar);
//	Musician frank = new Musician("Frank", instruments);
//	frank.play();
//	System.out.println("**********");
//	List<Instrument> instruments2 = instruments;
//	instruments2.add(saxo);
//	frank.play();
    }

    // Ici on appelle play de Musician
    // A l'ex�cution c'est la m�thode play des classes concr�tes qui est
    // invoqu�e
    // Polymorphisme "dynamique", invocation dynamique
    private static void play(List<Musician> musicians) {
	for (Musician musician : musicians) {
	    // System.out.println(instanceField);
	    musician.play();
	}
    }
}
