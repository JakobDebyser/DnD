package domain.model;

import domain.race.Attributes;
import domain.race.Race;

import java.util.ArrayList;
import java.util.List;

public class RangerClass implements ChClass {
    private String name;
    private List<String> skillsList = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();


    public RangerClass(String name) {
        this.name = name;
    }


    @Override
    public List<Integer> getAttributes(Race race) {
             if(race.name().equals("HUMAN")){
                attributes.add(3+ Attributes.DEXTERITY.getValues() + 1);
                attributes.add(1+Attributes.WISDOM.getValues()+1);

            }
            if(race.name().equals("DWARF")){
                attributes.add(3+ Attributes.DEXTERITY.getValues());
                attributes.add(1+Attributes.WISDOM.getValues());

            }
            if(race.name().equals("ELF")){
                attributes.add(3+ Attributes.DEXTERITY.getValues() +3);
                attributes.add(1+Attributes.WISDOM.getValues());

            }
            return attributes;
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

    }

    @Override
    public List<String> getSkills() {
        return null;
    }
}
