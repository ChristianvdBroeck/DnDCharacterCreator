package com.company;

/*
 * Created by Christian van den Broeck on 02/10/2019
 * ===
 * This is the Character Class -> the highest class
 */

import com.company.BaseClasses.CharacterClass;
import com.company.BaseClasses.CharacterRace;

public class Character {

    // fields:
    private String name;
    private int Strength;
    private int Dexterity;
    private int Constitution;
    private int Wisdom;
    private int Intelligence;
    private int Charisma;

    private CharacterClass characterClass;
    private CharacterRace race;

    // constructor:
    public Character() {

    }

    // getters
    public String getName() {
        return name;
    }

    public int getStrength() {
        return Strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public int getConstitution() {
        return Constitution;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public int getCharisma() {
        return Charisma;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public CharacterRace getRace() {
        return race;
    }

    // setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.Strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.Dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.Constitution = constitution;
    }

    public void setWisdom(int wisdom) {
        this.Wisdom = wisdom;
    }

    public void setIntelligence(int intelligence) {
        this.Intelligence = intelligence;
    }

    public void setCharisma(int charisma) {
        this.Charisma = charisma;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public void setRace(CharacterRace race) {
        this.race = race;
    }
}
