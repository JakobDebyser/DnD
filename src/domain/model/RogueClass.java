package domain.model;

import domain.race.Attributes;
import domain.race.Race;
import domain.race.Stats;
import domain.skills.Skills;

import java.util.ArrayList;
import java.util.List;

public class RogueClass implements ChClass {
    private String name;
    private List<Skills> skillsList = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();
    int hp=0;

    public RogueClass(String name) {
        this.name = name;
    }

    @Override
    public List<Integer> getAttributes(Race race) {
        if(race.name().equals("HUMAN")){
            attributes.add(Attributes.STRENGTH.getValues()+1);
            attributes.add(2+Attributes.INTELLIGENCE.getValues()+1);
            attributes.add(Attributes.WISDOM.getValues()+1);
            attributes.add(3+Attributes.DEXTERITY.getValues() + 1);
            attributes.add(Attributes.CONSTITUTION.getValues()+1);
            attributes.add(Attributes.CHARISMA.getValues()+1);
            hp=Attributes.CONSTITUTION.getValues()+1;

        }
        if(race.name().equals("DWARF")){
            attributes.add(3+Attributes.DEXTERITY.getValues());
            attributes.add(1+Attributes.INTELLIGENCE.getValues());
            attributes.add(Attributes.STRENGTH.getValues());
            attributes.add(Attributes.CHARISMA.getValues());
            attributes.add(Attributes.WISDOM.getValues());
            attributes.add(Attributes.CONSTITUTION.getValues());
            hp=Attributes.CONSTITUTION.getValues();

        }
        if(race.name().equals("ELF")){
            attributes.add(3+Attributes.DEXTERITY.getValues() + 3);
            attributes.add(1+Attributes.INTELLIGENCE.getValues()+3);
            attributes.add(Attributes.STRENGTH.getValues());
            attributes.add(Attributes.CHARISMA.getValues());
            attributes.add(Attributes.WISDOM.getValues());
            attributes.add(Attributes.CONSTITUTION.getValues());
            hp=Attributes.CONSTITUTION.getValues();

        }
        return attributes;
    }

    @Override
    public int getHealthPoints() {
        return hp* Stats.HP.getValue();
    }

    @Override
    public int getStamina() {
        return attributes.get(4)*Stats.SP.getValue();
    }

    @Override
    public int getManaPoints() {
        return attributes.get(5)* Stats.SP.getValue();
    }

    @Override
    public int getSpeed(Race race) {
        return race.getSpeed();
    }

    @Override
    public int getInitiative() {
        return Attributes.INITIATIVE.getValues();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void addSkills(String skill) {
        skillsList.addAll((Skills.getSkillList()));

    }

    @Override
    public List<Skills> getSkills() {
        return skillsList;
    }
}
