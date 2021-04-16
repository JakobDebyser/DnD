package domain.classes;

public interface Character {


    default int Stamina() {
        return 100;
    }

    default int strength() {
        return 10;
    }

    default int intelligence() {
        return 10;
    }

    default int wisdom() {
        return 10;
    }

    default int dexterity() {
        return 10;
    }

    default int Exppoints() {
        return 0;
    }

    default int constitution() {
        return 10;
    }

    default int charisma() {
        return 10;
    }

    default int ManaPoints() {
        return 100;
    }
    default int initiative(){
        return 6;
    }
}
