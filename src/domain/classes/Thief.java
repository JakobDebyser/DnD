package domain.classes;

public class Thief extends Character {
    @Override
    public int Stamina() {
        return 10;
    }

    @Override
    public int strength() {
        return 10;
    }

    @Override
    public int intelligence() {
        return 10+1;
    }

    @Override
    public int wisdom() {
        return 10;
    }

    @Override
    public int dexterity() {
        return 10+3;
    }

    @Override
    public int Exppoints() {
        return 0;
    }

    @Override
    public int constitution() {
        return 10;
    }

    @Override
    public int charisma() {
        return 10;
    }

    @Override
    public int ManaPoints() {
        return 10;
    }

    @Override
    public int initiative() {
        return 10+1;
    }

    @Override
    public void startingSkill() {

    }

    @Override
    public void startingItems() {

    }
}
