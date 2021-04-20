package domain.model;

import domain.race.Attributes;
import domain.race.Race;

import java.util.ArrayList;
import java.util.List;

public class MageClass implements ChClass {
    private String name;
    private List<String> skillsList = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();



    public MageClass(String name) {
        this.name = name;
    }


    @Override
    public List<Integer> getAttributes(Race race) {
        if(race.name().equals("HUMAN")){
            attributes.add(2+ Attributes.INTELLIGENCE.getValues() + 1);
            attributes.add(3+Attributes.WISDOM.getValues()+1);

        }
        if(race.name().equals("DWARF")){
            attributes.add(2+ Attributes.INTELLIGENCE.getValues());
            attributes.add(3+Attributes.WISDOM.getValues());

        }
        if(race.name().equals("ELF")){
            attributes.add(2+ Attributes.INTELLIGENCE.getValues() +3);
            attributes.add(3+Attributes.WISDOM.getValues()+3);

        }
        return attributes;
    }

    @Override
    public int getHealthPoints() {
        return 10;
    }

    @Override
    public int getStamina() {
        return 15;
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
