package fr.formation.musicians;

public interface StringInstrument extends NoisyInstrument {
    // public abstract String makeNoise();

    // Toutes les m�thodes d'une interface
    // sont abstract et public par d�faut
    @Override
    /**
     *
     */
    String makeNoise();
}
