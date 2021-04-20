package domain.model;

import domain.race.Attributes;
import domain.race.Race;
import domain.race.Stats;
import domain.skills.Skill;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WarriorClass implements ChClass{
    private String name;
    private List<Skill> skillList = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();

    public WarriorClass(String name) {
        this.name = name;
    }

    @Override
    public List<Integer> getAttributes(Race race) {
        if(race.name().equals("HUMAN")){
            attributes.add(Attributes.STRENGTH.getValue() + 1);
            attributes.add(Attributes.CONSTITUTION.getValue()+1);
            attributes.forEach(System.out::println);
        }
        if(race.name().equals("DWARF")){
            attributes.add(3*(Attributes.STRENGTH.getValue() +3));
            attributes.add(2*(Attributes.CONSTITUTION.getValue()+3));
            attributes.forEach(System.out::println);
        }
        if(race.name().equals("ELF")){
            attributes.add(3*(Attributes.STRENGTH.getValue()));
            attributes.add(2*(Attributes.CONSTITUTION.getValue()));
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
    public List<Skill> getSkillsList() {
        return skillList;
    }

    public void setSkillsList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public List<Integer> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Integer> attributes) {
        this.attributes = attributes;
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
