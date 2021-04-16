package domain.classes;

import java.util.ArrayList;
import java.util.List;

public class Mage extends Character {
    private int HP;
    private int MP;
    private int SP;
    private int speed;
    private int AC;
    private int initiative;
    private List<String> equipment=new ArrayList<>();
    private List<String> skills=new ArrayList<>();
    public int getSP() {
        return SP=dexterity()*5;
    }


    public int getAC() {
        return AC;
    }

    public int getInitiative() {
        return initiative=initiative();
    }

    public int getHP() {
        return HP=constitution()*5;
    }

    public int getMP() {
        return MP=wisdom()*5;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    @Override
    public int Stamina() {
        return 0;
    }

    @Override
    public int strength() {
        return 10;
    }

    @Override
    public int intelligence() {
        return 10+2;
    }

    @Override
    public int wisdom() {
        return 10 +3;
    }

    @Override
    public int dexterity() {
        return 10;
    }

    @Override
    public int Exppoints() {
        return 10;
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
        return 10;
    }

    @Override
    public void startingSkill() {
        skills.add("Lightning bolt");
    }


    @Override
    public void startingItems() {
        equipment.add("Wonky-looking wand");
        equipment.add("Burgundy Robes");
        equipment.add("Weak mana potion");

    }


}


