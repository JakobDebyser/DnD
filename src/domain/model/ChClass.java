package domain.model;

import domain.race.Race;
import domain.skills.Skill;

import java.util.List;

public interface ChClass {
    List<Integer> getAttributes(Race race);
    int getHealthPoints();
    int getStamina();
    int getManaPoints();
    int getSpeed(Race race);
    int getInitiative();
    String toString();

    void addSkills();
    void addItems();
    void addEquipment();
    double getDamage();

    List<Skill> getSkills();


}
