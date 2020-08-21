package fr.formation.musicians;

import java.util.ArrayList;
import java.util.List;

/**
 * Concepts fondamentaux orienté objet:
 * <ul>
 * <li>Classe: données + opérations, définition de type
 * <li>Objet: instance d'une classe avec un état spécifique
 * <li>Typage
 * <li>Encapsulation
 * <li>Composition
 * <li>Héritage
 * <li>Classes abstraites vs concrètes
 * <li>Classes abstraites, des classes incomplètes, une partir de
 * l'implémentation
 * <li>Redéfinition de méthodes, (re)défini une méthode abstraite, redéfini une
 * méthode concrète
 * <li>Polymorphisme
 * <li>Etat (state) : immuable (string) vs muable (métier)
 * </ul>
 */
//Langages typées: doit y avoir compatibilité de type entre le type de
// la variable et sa valeur (objet, instance)
// List<> => généricité
public class Application {

    private String instanceField = "not static";

    // Toutes les instances accèdent aux champs de classe
    private static String classField = "static";

    // Toutes les instances accèdent aux méthodes de classe (static)
    // Les méthodes de classe n'accèdent pas aux champs d'instance
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
    // A l'exécution c'est la méthode play des classes concrètes qui est
    // invoquée
    // Polymorphisme "dynamique", invocation dynamique
    private static void play(List<Musician> musicians) {
	for (Musician musician : musicians) {
	    // System.out.println(instanceField);
	    musician.play();
	}
    }
}
