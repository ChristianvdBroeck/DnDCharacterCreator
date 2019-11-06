package com.company.Classes;

import com.company.BaseClasses.AbilityScores;
import com.company.BaseClasses.CharacterClass;
import com.company.Enums.Proficiencies;

/*
 * Created by Christian van den Broeck on 06/11/2019
 * ===
 * THE FIGHTER CLASS
 *
 */

import java.util.List;

public class Fighter extends CharacterClass {

    // fields:
    private String hitDice = "d10";
    private String[] savingThrows = {"Strength", "Constitution"};
    private String[] skillsChoice = {"Acrobatics", "Animal Handling", "Athletics", "History", "Insight", "Intimidation", "Perception", "Survival"};
    // TODO:
    // Fighting Style feature requires a choice -> How To?
    private String[] features = {"Fighting Style", "Second Wind"};
    private String[] proficiencies = {"All Armor", "Shields", "Simple Weapons", "Martial Weapons"};
    private String[] firstEquipmentChoice = {"Chain Mail", "Leather Armore, Longbow and 20 arrows"};
    private String[] secondEquipmentChoice = {"Martial Weapon and a Shield", "Two Martial Weapons"};
    private String[] thirdEquipmentChoice = {"Light Crossbow and 20 bolts", "Two Handaxes"};
    private String [] fourthEquipment = {"Dungeoneer's Pack", "Explorer's Pacl"};

    private int proficiencyBonus = 2;
    private int numHitDice = 1;         // both rely on level

    // constructor:
    public Fighter() {
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
        super.setSecondEquipmentChoice(this.thirdEquipmentChoice);
        super.setSecondEquipmentChoice(this.fourthEquipment);

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
    public String[] getProficiencies() {
        return proficiencies;
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

    public String[] getFourthEquipment() {
        return fourthEquipment;
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
