package domain.classes;

import domain.equipment.Equipment;
import domain.skills.Skills;

public class Ranger extends CharacterClass {
    private String name;
    public Ranger(String name) {
        this.name = name;
        startingSkill();
        startingItems();
    }


    @Override
    public void startingSkill() {
        Skills.add("Piercing Shot");
    }

    @Override
    public void startingItems() {
        Equipment.addItem(1,"yen warbow","weapon");
        Equipment.addItem(20,"Barbed head arrow","consumable");
        Equipment.addItem(1,"Leather chest armour","medium armour");
    }


}
