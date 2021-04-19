package domain.classes;

public class Mage extends CharacterClass {
    private String name;
    public Mage(String name) {
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
