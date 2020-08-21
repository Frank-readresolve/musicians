package fr.formation.musicians;

public interface NoisyInstrument {

    // champs dans une interface sont par d�faut
    // public et static
    String defaultNoise = "boom";

    //
    String makeNoise();

    // String makeDefault();
    default String makeDefault() {
	return defaultNoise;
    }
}
