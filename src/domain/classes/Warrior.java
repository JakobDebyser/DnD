package domain.classes;

import domain.equipment.Equipment;

import domain.skills.Skills;

import java.util.ArrayList;

import java.util.List;

public class Warrior extends CharacterClass {
    private final String name;
    private int stamina = dexterity() * 5;
    private int strength = strength();
    private int constitution = constitution();
    private int HP = constitution * 5;
    private int dexterity = dexterity();
    private int SP = dexterity * 5;
    private int speed;
    private int AC;
    private int initiative = initiative();
    private int intelligence = intelligence();
    private int charisma = charisma();
    private final List<Integer> stats = new ArrayList<>();
    private final List<Integer> attributes = new ArrayList<>();
    private double damage = strength * 0.6;

    public List<Integer> getAttributes() {
        return attributes;
    }

    public List<String> getInventory() {
        return inventory;
    }

    private final List<String> inventory=new ArrayList<>(getStrength()*10);

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public Warrior(String name) {
        this.name = name;
        startingSkill();
        startingItems();
        classbonus();
        stats();
        attributes();

    }

    public List<Integer> getStats() {
        return stats;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {

        return name;

    }

    void stats() {
        stats.add(getHP());
        stats.add(getSP());
        stats.add(getSpeed());
        stats.add(getAC());
        stats.add(getInitiative());
    }

    void attributes() {
        attributes.add(getStrength());
        attributes.add(getIntelligence());
        attributes.add(getDexterity());
        attributes.add(getConstitution());
        attributes.add(getCharisma());
    }

    void classbonus() {
        setStrength(getStrength() + 3);
        setConstitution(getConstitution() + 2);
    }

    @Override
    void startingSkill() {
        Skills.add("Shield bash");
    }


    @Override
    void startingItems() {
        Equipment.addItem(1, "Castle-forged arming sword", "weapon");
        Equipment.addItem(1, "Kite-shield", "heavy armor");
        Equipment.addItem(1, "Royal blue brigandine gambeson", "heavy armor");
    }

    @Override
    int Stamina() {
        return super.Stamina();
    }

    @Override
    int strength() {
        return super.strength();
    }

    @Override
    int intelligence() {
        return super.intelligence();
    }

    @Override
    int wisdom() {
        return super.wisdom();
    }

    @Override
    int dexterity() {
        return super.dexterity();
    }

    @Override
    int Exppoints() {
        return super.Exppoints();
    }

    @Override
    int constitution() {
        return super.constitution();
    }

    @Override
    int charisma() {
        return super.charisma();
    }

    @Override
    int initiative() {
        return super.initiative();
    }
}
