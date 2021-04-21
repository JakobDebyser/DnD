package domain.model;

import domain.race.Attributes;
import domain.race.Race;
import domain.race.Stats;
import domain.skills.Skill;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RogueClass implements ChClass {
    private final String name;
    private final List<Skill> skillList = new ArrayList<>();
    private final List<Integer> attributes = new ArrayList<>();

    public RogueClass(String name) {
        this.name = name;
    }

    @Override
    public List<Integer> getAttributes(Race race) {
        if(race.name().equals("HUMAN")){
            attributes.add(3+Attributes.DEXTERITY.getValue() + 1);
            attributes.add(1+Attributes.INTELLIGENCE.getValue()+1);

        }
        if(race.name().equals("DWARF")){
            attributes.add(3+Attributes.DEXTERITY.getValue());
            attributes.add(1+Attributes.INTELLIGENCE.getValue());

        }
        if(race.name().equals("ELF")){
            attributes.add(3+Attributes.DEXTERITY.getValue() + 3);
            attributes.add(1+Attributes.INTELLIGENCE.getValue()+3);

        }
        return attributes;
    }

    @Override
    public int getHealthPoints() {
        return Attributes.CONSTITUTION.getValue()* Stats.HP.getValue();
    }

    @Override
    public int getStamina() {
        return Attributes.DEXTERITY.getValue()*Stats.SP.getValue();
    }

    @Override
    public int getManaPoints() {
        return 0;
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

    }

    @Override
    public void addEquipment() {

    }

    @Override
    public double getDamage() {
        return 0;
    }

    @Override
    public List<Skill> getSkills() {
        return skillList;
    }
}
