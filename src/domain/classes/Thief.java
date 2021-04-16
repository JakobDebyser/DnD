package domain.classes;

public class Thief implements Character{
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
        return Character.super.intelligence()+1;
    }

    @Override
    public int wisdom() {
        return Character.super.wisdom();
    }

    @Override
    public int dexterity() {
        return Character.super.dexterity()+3;
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

    @Override
    public int initiative() {
        return Character.super.initiative()+1;
    }

    @Override
    public String startingSkill() {
        return String.format("Stealth\n Backstab\n");
    }

    @Override
    public String startingItems() {
        return String.format("Short steel dagger\n Black hooded robes\n x10 lockpicks\n");
    }
}
