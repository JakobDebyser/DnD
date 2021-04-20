package domain.model;

import domain.race.Attributes;
import domain.race.Race;

import java.util.ArrayList;
import java.util.List;

public class WarriorClass implements ChClass{
    private String name;
    private List<String> skillsList = new ArrayList<>();
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
    public List<String> getSkillsList() {
        return skillsList;
    }

    public void setSkillsList(List<String> skillsList) {
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
        return 0;
    }

    @Override
    public int getStamina() {
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void addSkils(String skils) {
        skillsList.add("Shield bash");
    }

    @Override
    public List<String> getSkills() {
        return skillsList;
    }
}
