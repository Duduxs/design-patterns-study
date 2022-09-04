package patterns.behavioural.memento.examples.second;

import static patterns.behavioural.memento.examples.second.StarType.*;

/**
 * Star is the originator class who uses mementos to store and restore state
 */
public class StarOriginator {

    private StarType type;
    private int ageYears;
    private int massTons;

    public StarOriginator(StarType type, int ageYears, int massTons) {
        this.type = type;
        this.ageYears = ageYears;
        this.massTons = massTons;
    }

    /**
     * Make the time passes for the star.
     */
    public void timePasses() {
        ageYears *= 2;
        massTons *= 8;

        switch (type) {
            case RED_GIANT -> type = WHITE_DWARF;
            case SUN -> type = RED_GIANT;
            case SUPERNOVA -> type = DEAD;
            case WHITE_DWARF -> type = SUPERNOVA;
            case DEAD -> {
                ageYears *= 2;
                massTons = 0;
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);

        }
    }

    StarMemento backup() {
        return new StartMementoInternal(type, ageYears, massTons);
    }

    void restore(StarMemento memento) {
        if (memento instanceof StartMementoInternal s) {
            this.type = s.type;
            this.ageYears = s.ageYears;
            this.massTons = s.massTons;
        }
    }

    @Override
    public String toString() {
        return String.format("%s age: %d years mass: %d tons", type, ageYears, massTons);
    }

    private static class StartMementoInternal implements StarMemento {

        private StarType type;
        private int ageYears;
        private int massTons;

        public StartMementoInternal(StarType type, int ageYears, int massTons) {
            this.type = type;
            this.ageYears = ageYears;
            this.massTons = massTons;
        }

        public StarType getType() {
            return type;
        }

        public int getAgeYears() {
            return ageYears;
        }

        public int getMassTons() {
            return massTons;
        }
    }

}
