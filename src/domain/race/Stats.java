package domain.race;

public enum Stats {
    HP(5),
    XP(5),
    SP(5);

    int points;
    Stats(int points) {
        this.points = points;
    }


    public  int getValue() {
        return points;
    }
}
