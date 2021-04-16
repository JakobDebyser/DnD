package domain.classes;

public class Thief implements Character {
    private String name;

    public Thief(String name) {
        this.name =name;
    }
    @Override
    public String toString() {

        return name;
    }
}
