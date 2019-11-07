package com.company.Classes;

import com.company.BaseClasses.CharacterClass;

public class Rogue extends CharacterClass {

    // fields:
    private String hitDice = "d8";
    private String[] savingThrows = {"Intelligence", "Dexterity"};
    private String[] skillsChoice = {"Acrobatics", "Athletics", "Deception", "Insight", "Intimidation", "Investigation", "Perception", "Persuasion", "Stealth", "Sleight of Hand"};
    private String[] features = {"Expertise", "Sneak Attack", "Thieves' Cant"};
    private String[] weaponProficiencies = {"Light Armor", "Medium Armor", "Shields", "Simple Weapons", "Martial Weapons"};
    private String[] firstEquipmentChoice = {"Rapier", "Short sword"};
    private String[] secondEquipmentChoice = {"Short bow and a quiver of 20 arrows", "Shortsword"};
    private String[] thirdEquipmentChoice = {"Burglar's pack", "Dungeoneer's pack", "Explorer's pack"};
    private String [] guaranteedEquipment = {"Leather Armor", "Two Daggers", "Thieves' Tools"};
    // tool proficiencies: artisan's tools or one musical instrument

    private int proficiencyBonus = 2;
    private int numHitDice = 1;         // both rely on level

    // constructor:
    public Rogue() {

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
    public String[] getThirdEquipmentChoice() {
        return thirdEquipmentChoice;
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
