package domain.classes;

import domain.equipment.Equipment;
import domain.skills.Skills;

public class Mage extends CharacterClass {
    private String name;
    public Mage(String name) {
        this.name = name;
        startingSkill();
        startingItems();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    void startingSkill() {
        Skills.add("Lightning bolt");
    }

    @Override
    void startingItems() {
        Equipment.addItem(1,"Wonkey-looking wand","weapon");
        Equipment.addItem(1,"Burgundy robes","light armour");
        Equipment.addItem(1,"Weak mana potion","consumable");
    }

}
