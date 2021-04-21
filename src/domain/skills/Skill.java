package domain.skills;

import java.util.ArrayList;
import java.util.List;

public class Skill {
    private static final List<Skill> skillList = new ArrayList<>();
    private final String skillname;
    public Skill(String skillname) {
        this.skillname=skillname;
    }

    public static void add(Skill skill) {

        skillList.add(skill);
    }

    public static List<Skill> getSkillList() {
        return skillList;



    }
}
