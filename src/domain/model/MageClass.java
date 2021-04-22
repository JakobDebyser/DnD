package domain.model;

import domain.race.Attributes;
import domain.race.Race;
import domain.race.Stats;
import domain.skills.Skill;

import java.util.ArrayList;
import java.util.List;

public class MageClass implements ChClass {
    private String name;
    private List<Skill> skillList = new ArrayList<>();
    private List<Integer> attributes = new ArrayList<>();
    private List<String> inventory = new ArrayList<>();
    int hp = 0;
    int xp=0;
    int sp=0;

    public MageClass(String name) {
        this.name = name;
    }


    @Override
    public List<Integer> getAttributes(Race race) {
        if (race.name().equals("HUMAN")) {
            attributes.add(Attributes.STRENGTH.getValue() + 1);
            attributes.add(Attributes.CONSTITUTION.getValue() + 1);
            attributes.add(2+Attributes.INTELLIGENCE.getValue() + 1);
            attributes.add(3+Attributes.WISDOM.getValue() + 1);
            attributes.add(Attributes.CHARISMA.getValue() + 1);
            attributes.add( Attributes.DEXTERITY.getValue() + 1);
            hp = Attributes.CONSTITUTION.getValue()+1 ;
            xp = Attributes.DEXTERITY.getValue() + 1;
            sp = Attributes.DEXTERITY.getValue() + 1;

        }
        if (race.name().equals("DWARF")) {
            attributes.add(Attributes.STRENGTH.getValue() + 3);
            attributes.add(Attributes.CONSTITUTION.getValue() + 3);
            attributes.add(2+ Attributes.INTELLIGENCE.getValue());
            attributes.add(3+Attributes.WISDOM.getValue());
            attributes.add(Attributes.CHARISMA.getValue());
            attributes.add(Attributes.DEXTERITY.getValue());
            hp = Attributes.CONSTITUTION.getValue() + 3;
            xp = Attributes.DEXTERITY.getValue();
            sp = Attributes.DEXTERITY.getValue();

        }
        if (race.name().equals("ELF")) {
            attributes.add(Attributes.STRENGTH.getValue());
            attributes.add(Attributes.CONSTITUTION.getValue());
            attributes.add(2 + Attributes.INTELLIGENCE.getValue() + 3);
            attributes.add(3 + Attributes.WISDOM.getValue());
            attributes.add(Attributes.CHARISMA.getValue());
            attributes.add(Attributes.DEXTERITY.getValue() + 3);
            hp = Attributes.CONSTITUTION.getValue();
            xp = Attributes.DEXTERITY.getValue() + 3;
            sp = Attributes.DEXTERITY.getValue() + 3;
        }
            return attributes;
    }

    @Override
    public int getHP() {
        return hp* Stats.HP.getValue();
    }

    @Override
    public int getXP() {
        return xp*Stats.XP.getValue();
    }

    @Override
    public int getSP() {
        return sp*Stats.SP.getValue();
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
    public void addSkills(Skill skill) {
        skillList.add(skill);

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
