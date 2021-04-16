package domain.classes;

public class Warrior implements Character {
    private String name;
    public Warrior(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return name;
    }
}
