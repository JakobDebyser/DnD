package domain.race;

public enum Attributes {
    STRENGTH(10),
    DEXTERITY(10),
    CONSTITUTION(10),
    INTELLIGENCE(10),
    WISDOM(10),
    CHARISMA(10);
    int points;
    Attributes(int points) {
        this.points=points;
    }
    public  int getSpeed() {
        return points;
    }
}
