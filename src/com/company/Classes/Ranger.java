package com.company.Classes;

import com.company.BaseClasses.CharacterClass;

public class Ranger extends CharacterClass {

    // fields:
    private String hitDice = "d10";
    private String[] savingThrows = {"Strength", "Dexterity"};
    private String[] skillsChoice = {"Animal Handling", "Athletics", "Insight", "Investigation", "Nature", "Perception", "Stealth", "Survival"};
    private String[] features = {"Favored Enemy", "Natural Explorer"};
    private String[] weaponProficiencies = {"Light Armor", "Medium Armor", "Shields", "Simple Weapons", "Martial Weapons"};
    private String[] firstEquipmentChoice = {"Scale mail", "Leather Armor"};
    private String[] secondEquipmentChoice = {"Two shortswords", "Two simple melee weapons"};
    private String[] thirdEquipmentChoice = {"Dungeoneer's pack", "Explorer's pack"};
    private String [] guaranteedEquipment = {"Longbow", "Quiver of 20 arrows"};
    // tool proficiencies: artisan's tools or one musical instrument

    private int proficiencyBonus = 2;
    private int numHitDice = 1;         // both rely on level

    // constructor:
    public Ranger() {

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

    // getter:
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
