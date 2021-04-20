package domain.race;

public enum Stats {
    HP(5),
    MP(5),
    SP(5);

    int points;
    Stats(int points) {
        this.points = points;
    }


    public  int getSpeed() {
        return points*4;
    }
}
