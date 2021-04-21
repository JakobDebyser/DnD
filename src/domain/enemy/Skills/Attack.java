package domain.enemy.Skills;

import domain.enemy.Being;

public class Attack {
    private Being user;
    private String name;
    private double value;
    private int SP_Requirement;

    public Attack(Being being, String name, double value, int SP_Requirement) {
        this.user=being;
        this.name=name;
        this.value=value;
        this.SP_Requirement=SP_Requirement;
    }

    public Being getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value*0.6;
    }

    public int getSP_Requirement() {
        return SP_Requirement;
    }
}
