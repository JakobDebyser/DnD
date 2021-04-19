package domain.classes;

public class Warrior extends CharacterClass {
    private String name;
    public Warrior(String name) {
        this.name = name;
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
