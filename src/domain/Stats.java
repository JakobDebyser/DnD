package domain;

public class Stats {
    private int Strength = 10;
    private int Intelligence = 10;
    private int Wisdom = 10;
    private int Dexterity = 10;
    private int Constitution = 10;
    private int Charisma = 10;
    private int Initiative = 5;
    private int maxHP;
    private int maxMP;
    private int SP;

    public Stats(int strength,int intelligence,int wisdom,int dexterity,int constitution,int charisma,int initiative){
       setStrength(strength);
       setIntelligence(intelligence);
       setWisdom(wisdom);
       setDexterity(dexterity);
       setConstitution(constitution);
       setCharisma(charisma);
    }

    public int getSP() {
        return SP = getDexterity() * 5;
    }

    private int getDexterity() {
        return Dexterity;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        Constitution = constitution;
    }

    public int getCharisma() {
        return Charisma;
    }

    public void setCharisma(int charisma) {
        Charisma = charisma;
    }

    public int getInitiative() {
        return Initiative;
    }

    public void setInitiative(int initiative) {
        Initiative = initiative;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public int getHP() {
        return maxHP = getConstitution() * 5;
    }

    private int getConstitution() {
        return Constitution;
    }


}
