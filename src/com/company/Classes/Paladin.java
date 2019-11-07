package com.company.Classes;

import com.company.BaseClasses.CharacterClass;

public class Paladin extends CharacterClass {

    // fields:
    private String hitDice = "d10";
    private String[] savingThrows = {"Wisdom", "Charisma"};
    private String[] skillsChoice = {"Acrobatics", "Insight", "Intimidation", "Medicine", "Persuasion", "Religion"};
    private String[] features = {"Devine Sense", "Lay on Hands"};
    private String[] weaponProficiencies = {"Martial Weapons", "Simple Weapons"};
    private String[] firstEquipmentChoice = {"Martial weapon and a shield", "Two martial weapons"};
    private String[] secondEquipmentChoice = {"Five Javelins", "Simple melee weapon"};
    private String[] thirdEquipmentChoice = {"Priest pack", "Explorer's pack"};
    private String [] guaranteedEquipment = {"Chain mail", "Holy Symbol"};
    // tool proficiencies: artisan's tools or one musical instrument

    private int proficiencyBonus = 2;
    private int numHitDice = 1;         // both rely on level

    // constructor:
    public Paladin() {
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
        super.setThirdEquipmentChoice(this.thirdEquipmentChoice);
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
