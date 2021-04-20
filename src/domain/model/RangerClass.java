package domain.model;

import domain.race.Attributes;
import domain.race.Race;
import domain.race.Stats;
import domain.skills.Skills;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RangerClass implements ChClass {
    private String name;
    private List<Skills> skillsList = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();


    public RangerClass(String name) {
        this.name = name;
    }


    @Override
    public List<Integer> getAttributes(Race race) {
             if(race.name().equals("HUMAN")){
                attributes.add(3+ Attributes.DEXTERITY.getValues() + 1);
                attributes.add(1+Attributes.WISDOM.getValues()+1);
                attributes.add(Attributes.STRENGTH.getValues());
                attributes.add(Attributes.CHARISMA.getValues());
                attributes.add(Attributes.INTELLIGENCE.getValues());
                attributes.add(Attributes.CONSTITUTION.getValues());

            }
            if(race.name().equals("DWARF")){
                attributes.add(3+ Attributes.DEXTERITY.getValues());
                attributes.add(1+Attributes.WISDOM.getValues());
                attributes.add(Attributes.STRENGTH.getValues());
                attributes.add(Attributes.CHARISMA.getValues());
                attributes.add(Attributes.INTELLIGENCE.getValues());
                attributes.add(Attributes.CONSTITUTION.getValues());


            }
            if(race.name().equals("ELF")){
                attributes.add(3+ Attributes.DEXTERITY.getValues() +3);
                attributes.add(1+Attributes.WISDOM.getValues());
                attributes.add(Attributes.STRENGTH.getValues());
                attributes.add(Attributes.CHARISMA.getValues());
                attributes.add(Attributes.INTELLIGENCE.getValues());
                attributes.add(Attributes.CONSTITUTION.getValues());

            }
            return attributes;
    }

    @Override
    public int getHealthPoints() {
        return Attributes.CONSTITUTION.getValues()* Stats.HP.getValue();
    }

    @Override
    public int getStamina() {
        return Attributes.DEXTERITY.getValues()*Stats.SP.getValue();
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
        return Attributes.INITIATIVE.getValues();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void addSkills(String skill) {
        skillsList.addAll(Objects.requireNonNull(Skills.getSkillList()));
    }

    @Override
    public List<Skills> getSkills() {
        return skillsList;
    }
}
