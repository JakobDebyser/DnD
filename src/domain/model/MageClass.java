package domain.model;

import domain.race.Attributes;
import domain.race.Race;
import domain.race.Stats;
import domain.skills.Skills;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MageClass implements ChClass {
    private String name;
    private List<Skills> skillsList = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();


    public MageClass(String name) {
        this.name = name;
    }


    @Override
    public List<Integer> getAttributes(Race race) {
        if (race.name().equals("HUMAN")) {
            attributes.add(2 + Attributes.INTELLIGENCE.getValues() + 1);
            attributes.add(3 + Attributes.WISDOM.getValues() + 1);

        }
        if (race.name().equals("DWARF")) {
            attributes.add(2 + Attributes.INTELLIGENCE.getValues());
            attributes.add(3 + Attributes.WISDOM.getValues());

        }
        if (race.name().equals("ELF")) {
            attributes.add(2 + Attributes.INTELLIGENCE.getValues() + 3);
            attributes.add(3 + Attributes.WISDOM.getValues() + 3);

        }
        return attributes;
    }

    @Override
    public int getHealthPoints() {
        return Attributes.CONSTITUTION.getValues() * Stats.HP.getValue();
    }


    @Override
    public int getStamina() {
        return 0;
    }

    @Override
    public int getManaPoints() {
        return Attributes.WISDOM.getValues() * Stats.MP.getValue();
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
    public void addSkills(String skills) {
        skillsList.addAll(Objects.requireNonNull(Skills.getSkillList()));
    }

    @Override
    public List<Skills> getSkills() {
        return skillsList;
    }
}
