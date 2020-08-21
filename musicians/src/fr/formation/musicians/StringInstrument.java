package fr.formation.musicians;

public interface StringInstrument extends NoisyInstrument {
    // public abstract String makeNoise();

    // Toutes les méthodes d'une interface
    // sont abstract et public par défaut
    @Override
    /**
     *
     */
    String makeNoise();
}
