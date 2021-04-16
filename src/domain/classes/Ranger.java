package domain.classes;

import domain.equipment.Equipment;
import domain.skills.Skills;

public class Ranger extends Character {
    private int HP;
    private int Stam;
    private int SP;
    private int speed;
    private int AC;
    private int initiative;

    public int getStam() {
        return Stam=dexterity()*5;
    }

    public int getSP() {
        return SP=dexterity()*5;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public int getInitiative() {
        return initiative=initiative();
    }

    public int getHP() {
        return HP=constitution()*5;
    }

    @Override
    public int Stamina() {
        return 10;
    }

    @Override
    public int initiative() {
        return 10+1;
    }

    @Override
    public void startingSkill() {
        Skills.add("Piercing Shot");
    }

    @Override
    public void startingItems() {
       Equipment.addItem(1,"Yew warbow","weapon");
       Equipment.addItem(20,"barbed head arrows","consumable");
       Equipment.addItem(1,"Leather chest armour","light armor");
    }


    public int strength() {
        return 10;
    }

    @Override
    public int intelligence() {
        return 10;
    }

    @Override
    public int wisdom() {
        return 10+1;
    }

    @Override
    public int dexterity() {
        return 10+3;
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
        return 0;
    }
}
