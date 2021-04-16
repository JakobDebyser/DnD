package domain.classes;

public class Mage implements Character {
    private String name;
    public Mage(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
