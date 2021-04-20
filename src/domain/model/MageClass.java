package domain.model;

import domain.equipment.Equipment;
import domain.inventory.Inventory;
import domain.race.Attributes;
import domain.race.Race;
import domain.race.Stats;
import domain.skills.Skill;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MageClass implements ChClass {
    private final String name;
    private final List<Skill> skillList = new ArrayList<>();
    private final List<Integer> attributes = new ArrayList<>();
    private final List<String> inventory = new ArrayList<>(Attributes.STRENGTH.getValue() * 10);
    private final List<String> equipment = new ArrayList<>(5);

    public MageClass(String name) {
        this.name = name;
    }


    @Override
    public List<Integer> getAttributes(Race race) {
        if (race.name().equals("HUMAN")) {
            attributes.add(Attributes.STRENGTH.getValue() + 1);
            attributes.add(2 + Attributes.INTELLIGENCE.getValue() + 1);
            attributes.add(3 + Attributes.WISDOM.getValue() + 1);
            attributes.add(Attributes.DEXTERITY.getValue() + 1);
            attributes.add(Attributes.CONSTITUTION.getValue() + 1);
            attributes.add(Attributes.CHARISMA.getValue() + 1);
            attributes.add(getHealthPoints());
            attributes.add(getManaPoints());
            attributes.add(Attributes.INITIATIVE.getValue()+1 );

        }
        if (race.name().equals("DWARF")) {
            attributes.add(Attributes.STRENGTH.getValue()+3);
            attributes.add(2 + Attributes.INTELLIGENCE.getValue());
            attributes.add(3 + Attributes.WISDOM.getValue());
            attributes.add(Attributes.DEXTERITY.getValue() );
            attributes.add(Attributes.CONSTITUTION.getValue() + 3);
            attributes.add(Attributes.CHARISMA.getValue() );
            attributes.add(getHealthPoints());
            attributes.add(getManaPoints());
            attributes.add(Attributes.INITIATIVE.getValue() );
        }
        if (race.name().equals("ELF")) {
            attributes.add(2 + Attributes.INTELLIGENCE.getValue() + 3);
            attributes.add(3 + Attributes.WISDOM.getValue() + 3);

        }
        return attributes;
    }

    @Override
    public int getHealthPoints() {
        return Attributes.CONSTITUTION.getValue() * Stats.HP.getValue();
    }


    @Override
    public int getStamina() {
        return 0;
    }

    @Override
    public int getManaPoints() {
        return Attributes.WISDOM.getValue() * Stats.MP.getValue();
    }

    @Override
    public int getSpeed(Race race) {

        return race.getSpeed();

    }

    @Override
    public int getInitiative() {
        return Attributes.INITIATIVE.getValue();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void addSkills() {
        if (!skillList.containsAll(Skill.getSkillList()))
            skillList.addAll(Objects.requireNonNull(Skill.getSkillList()));
    }

    @Override
    public void addItems() {
        if (!inventory.containsAll(Inventory.getInventory()))
            inventory.addAll(Inventory.getInventory());
    }

    @Override
    public void addEquipment() {
        if (!equipment.containsAll(Equipment.getEquipments())) {
            equipment.addAll(Equipment.getEquipments());
        }
    }

    @Override
    public double getDamage() {
        return attributes.get(Attributes.STRENGTH.getValue())*0.6;
    }

    @Override
    public List<Skill> getSkills() {
        return skillList;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public List<Integer> getAttributes() {
        return attributes;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public List<String> getEquipment() {
        return equipment;
    }
}
