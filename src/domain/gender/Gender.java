package domain.gender;

public enum Gender {
    MALE,FEMALE;

    @Override
    public String toString() {
        return name();
    }
}
