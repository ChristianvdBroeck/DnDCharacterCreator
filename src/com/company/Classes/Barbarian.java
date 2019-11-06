package com.company.Classes;

import com.company.BaseClasses.CharacterClass;

/*
 * Created by Christian van den Broeck on 31/10/2019
 * ===
 * THE BARBARIAN CLASS
 *
 */

public class Barbarian extends CharacterClass {

    // fields:
    private String hitDice = "d12";
    private String[] savingThrows = {"Strength", "Constitution"};
    private String[] skillsChoice = {"Animal Handling", "Athletics", "Intimidation", "Nature", "Perception", "Survival"};
    private String[] features = {"Rage", "Unarmored Defense"};
    private String[] proficiencies = {"Light Armor", "Medium Armor", "Shields", "Simple Weapons", "Martial Weapons"};
    private String[] firstEquipmentChoice = {"Greataxe", "Martial Melee Weapon"};
    private String[] secondEquipmentChoice = {"Two Handaxes", "Any Simple Weapon"};
    private String [] guaranteedEquipment = {"Explorer's Pack", "Four Javelins"};

    private int proficiencyBonus = 2;
    private int numHitDice = 1;         // both rely on level

    // constructor:
    public Barbarian() {
        super();

        super.setProficiencyBonus(this.proficiencyBonus);
        super.setNumHitDice(this.numHitDice);
        super.setHitDice(this.hitDice);
        super.setSavingThrows(this.savingThrows);
        super.setSkillsChoice(this.skillsChoice);
        super.setFeatures(this.features);
        super.setProficiencies(this.proficiencies);
        super.setFirstEquipmentChoice(this.firstEquipmentChoice);
        super.setSecondEquipmentChoice(this.secondEquipmentChoice);
        super.setGuaranteedEquipment(this.guaranteedEquipment);

    }

    // getters:
    @Override
    public String getHitDice() {
        return this.hitDice;
    }

    @Override
    public String[] getSavingThrows() {
        return this.savingThrows;
    }

    @Override
    public String[] getSkillsChoice() {
        return this.skillsChoice;
    }

    @Override
    public String[] getFeatures() {
        return this.features;
    }

    @Override
    public String[] getProficiencies() {
        return this.proficiencies;
    }

    @Override
    public String[] getFirstEquipmentChoice() {
        return this.firstEquipmentChoice;
    }

    @Override
    public String[] getSecondEquipmentChoice() {
        return this.secondEquipmentChoice;
    }

    @Override
    public String[] getGuaranteedEquipment() {
        return this.guaranteedEquipment;
    }
}
