package domain.classes;

public class Ranger implements Character{
    @Override
    public int Stamina() {
        return Character.super.Stamina();
    }

    @Override
    public int initiative() {
        return Character.super.initiative()+1;
    }

    @Override
    public String startingSkill() {
        return "Piercing shot";
    }

    @Override
    public String startingItems() {
        return String.format("Yew warbow\n x20 barbed head arrows\n Leather chest armour\n");
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
        return Character.super.wisdom()+1;
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
        return 0;
    }
}
