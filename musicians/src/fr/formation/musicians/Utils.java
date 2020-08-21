package fr.formation.musicians;

import java.util.List;

public class Utils {

    public static String toto = "toto";

    public static void play(List<Musician> musicians) {
	for (Musician musician : musicians) {
	    // System.out.println(instanceField);
	    musician.play();
	}
    }
}
