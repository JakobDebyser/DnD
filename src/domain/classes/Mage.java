package domain.classes;

public class Mage implements Character {
    private int HP;
    private int MP;

    @Override
    public int Stamina() {
        return 0;
    }

    @Override
    public int strength() {
        return Character.super.strength();
    }

    @Override
    public int intelligence() {
        return Character.super.intelligence()+2;
    }

    @Override
    public int wisdom() {
        return Character.super.wisdom() +3;
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

    @Override
    public int initiative() {
        return Character.super.initiative();
    }

    @Override
    public String startingSkill() {
        return "Lightning Bolt";
    }


    @Override
    public String startingItems() {
        return String.format("Wonky looking wand\n Burgundy Robes\n Weak mana potion");
    }


}


