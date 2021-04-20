package domain.model;

import domain.race.Attributes;
import domain.race.Race;
import domain.race.Stats;
import domain.skills.Skills;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WarriorClass implements ChClass{
    private String name;
    private List<Skills> skillsList = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();

    public WarriorClass(String name) {
        this.name = name;
    }

    @Override
    public List<Integer> getAttributes(Race race) {
        if(race.name().equals("HUMAN")){
            attributes.add(Attributes.STRENGTH.getValues() + 1);
            attributes.add(Attributes.CONSTITUTION.getValues()+1);
            attributes.forEach(System.out::println);
        }
        if(race.name().equals("DWARF")){
            attributes.add(3*(Attributes.STRENGTH.getValues() +3));
            attributes.add(2*(Attributes.CONSTITUTION.getValues()+3));
            attributes.forEach(System.out::println);
        }
        if(race.name().equals("ELF")){
            attributes.add(3*(Attributes.STRENGTH.getValues()));
            attributes.add(2*(Attributes.CONSTITUTION.getValues()));
            attributes.forEach(System.out::println);
        }
        return attributes;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Skills> getSkillsList() {
        return skillsList;
    }

    public void setSkillsList(List<Skills> skillsList) {
        this.skillsList = skillsList;
    }

    public List<Integer> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Integer> attributes) {
        this.attributes = attributes;
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
