package domain.skills;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Skills {
    private static  List<Skills> skillList = new ArrayList<>();
    private final String skillname;
    public Skills(String skillname) {
        this.skillname=skillname;
    }

    public static void add(Skills skill) {

        skillList.add(skill);
    }

    public static List<Skills> getSkillList() {
        System.out.println("Skills: ");
        skillList.forEach(skills -> System.out.println(skills.skillname));


        return null;
    }
}
