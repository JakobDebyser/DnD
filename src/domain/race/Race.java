package domain.race;

public enum Race {
    HUMAN(6),DWARF(5),ELF(7);

    private final int speed;

    Race(int baseSpeed){
        this.speed=baseSpeed;
    }

    public  int getSpeed() {
        return speed*4;
    }

}
