package com.company.Classes;

import com.company.BaseClasses.CharacterClass;

public class Monk extends CharacterClass {

    // fields:
    private String hitDice = "d8";
    private String[] savingThrows = {"Strength", "Dexterity"};
    private String[] skillsChoice = {"Acrobatics", "Athletics", "History", "Insight", "Religion", "Stealth"};
    private String[] features = {"Martial Arts", "Unarmored Defense"};
    private String[] weaponProficiencies = {"Shortswords", "Simple Weapons"};
    private String[] firstEquipmentChoice = {"Greataxe", "Martial Melee Weapon"};
    private String[] secondEquipmentChoice = {"Dungeoneer's Pack", "Explorer's Pack"};
    private String [] guaranteedEquipment = {"10 darts"};
    // tool proficiencies: artisan's tools or one musical instrument

    private int proficiencyBonus = 2;
    private int numHitDice = 1;         // both rely on level

    // constructor:
    public Monk() {
        super();

        super.setProficiencyBonus(this.proficiencyBonus);
        super.setNumHitDice(this.numHitDice);
        super.setHitDice(this.hitDice);
        super.setSavingThrows(this.savingThrows);
        super.setSkillsChoice(this.skillsChoice);
        super.setFeatures(this.features);
        super.setWeaponProficiencies(this.weaponProficiencies);
        super.setFirstEquipmentChoice(this.firstEquipmentChoice);
        super.setSecondEquipmentChoice(this.secondEquipmentChoice);
        super.setGuaranteedEquipment(this.guaranteedEquipment);
    }

    // getters:
    @Override
    public String getHitDice() {
        return hitDice;
    }

    @Override
    public String[] getSavingThrows() {
        return savingThrows;
    }

    @Override
    public String[] getSkillsChoice() {
        return skillsChoice;
    }

    @Override
    public String[] getFeatures() {
        return features;
    }

    @Override
    public String[] getWeaponProficiencies() {
        return weaponProficiencies;
    }

    @Override
    public String[] getFirstEquipmentChoice() {
        return firstEquipmentChoice;
    }

    @Override
    public String[] getSecondEquipmentChoice() {
        return secondEquipmentChoice;
    }

    @Override
    public String[] getGuaranteedEquipment() {
        return guaranteedEquipment;
    }

    @Override
    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    @Override
    public int getNumHitDice() {
        return numHitDice;
    }
}
