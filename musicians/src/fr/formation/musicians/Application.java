package fr.formation.musicians;

import java.util.ArrayList;
import java.util.List;

/**
 * Concepts fondamentaux orient� objet:
 * <ul>
 * <li>Classe: donn�es + op�rations, d�finition de type
 * <li>Typage
 * <li>Encapsulation
 * <li>Composition
 * <li>H�ritage
 * <li>Polymorphisme
 * </ul>
 */
//Langages typ�es: doit y avoir compatibilit� de type entre le type de
// la variable et sa valeur (objet, instance)
// List<> => g�n�ricit�
public class Application {

    private String instanceField = "";

    private static String classField = "";

    public static void main(String[] args) {
	Instrument guitar = new Guitar("guitar");
	Instrument piano = new Piano("piano");
	Instrument saxo = new Saxophone("saxophone");
	List<Musician> musicians = new ArrayList<>();
	musicians.add(new Musician("Geo", guitar, piano));
	Instrument[] instruments = { null }; // {guitar};
	musicians.add(new Musician("Laurent", instruments));
	musicians.add(new Musician("India", saxo, guitar));
	play(musicians);
	// Bad:
//	List<Instrument> instruments = new ArrayList<>();
//	instruments.add(guitar);
//	Musician frank = new Musician("Frank", instruments);
//	frank.play();
//	System.out.println("**********");
//	instruments.add(saxo);
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
