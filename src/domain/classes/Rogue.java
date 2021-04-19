package domain.classes;

public class Rogue extends CharacterClass {
    private String name;

    public Rogue(String name) {
        this.name =name;
    }
    @Override
    public String toString() {

        return name;
    }

    @Override
    void startingSkill() {

    }

    @Override
    void startingItems() {

    }
}
