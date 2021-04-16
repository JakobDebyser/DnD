package domain.classes;

public class Ranger implements Character{
    @Override
    public int Stamina() {
        return Character.super.Stamina();
    }

    @Override
    public int strength() {
        return Character.super.strength();
    }

    @Override
    public int intelligence() {
        return Character.super.intelligence();
    }

    @Override
    public int wisdom() {
        return Character.super.wisdom();
    }

    @Override
    public int dexterity() {
        return Character.super.dexterity();
    }

    @Override
    public int Exppoints() {
        return Character.super.Exppoints();
    }

    @Override
    public int constitution() {
        return Character.super.constitution();
    }

    @Override
    public int charisma() {
        return Character.super.charisma();
    }

    @Override
    public int ManaPoints() {
        return Character.super.ManaPoints();
    }
}
