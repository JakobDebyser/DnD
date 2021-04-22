package domain.model;

import domain.race.Race;
import domain.skills.Skill;

import java.util.List;

public interface ChClass {
    List<Integer> getAttributes(Race race);
    int getHP();
    int getSP();
    int getXP();
    int getInitiative();
    String toString();

    void addSkills(Skill skill);
    void addItems();
    void addEquipment();
    double getDamage();

    List<Skill> getSkills();


}
