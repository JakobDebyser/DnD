package domain.skills;

import java.util.ArrayList;
import java.util.List;

public class Skills {
    private static List<String> skillList = new ArrayList<>();
    public static void add(String skillname) {

        skillList.add(skillname);
    }

    public static void getSkillList() {
        System.out.println("Skills: ");
        for (String s:skillList
             ) {
            System.out.println(s);
        }


    }
}
