package domain.classes;

import domain.Stats;

public enum CharacterClass {
    WARRIOR(new Stats(13,10,10,10,12,10,5)),
    RANGER(new Stats(10,10,11,13,10,10,6)),
    ROGUE(new Stats(10,11,10,13,10,10,6)),
    MAGE(new Stats(10,12,13,10,10,10,5));

    private final Stats startingstats;
    CharacterClass(Stats startingstats) {
        this.startingstats=startingstats;
    }
    public Stats getStartingstats(){
        return startingstats;
    }
}
