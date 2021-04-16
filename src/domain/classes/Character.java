package domain.classes;

abstract class Character {


    int Stamina() {
        return 100;
    }

    int strength() {
        return 10;
    }

    int intelligence() {
        return 10;
    }

    int wisdom() {
        return 10;
    }

    int dexterity() {
        return 10;
    }

    int Exppoints() {
        return 0;
    }

    int constitution() {
        return 10;
    }

    int charisma() {
        return 10;
    }

    int ManaPoints() {
        return 100;
    }

    int initiative() {
        return 5;
    }

    abstract void startingSkill();

    abstract void startingItems();


}
