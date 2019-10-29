package com.company.BaseClasses;

import com.company.Enums.Proficiencies;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Created by Christian van den Broeck on 02/10/2019
 * ===
 * This base class describes a character's class. All specific classes will inherit from this base class.
 *
 */

public abstract class CharacterClass {

    // fields:
    private int numHitDice;
    private String hitDice;
    private int proficiencyBonus;
    private String[] savingThrows;
    private String[] skills;
    private String[] features;
    private String[] proficiencies;
    private String[] firstEquipmentChoice;
    private String[] secondEquipmentChoice;
    private String[] guaranteedEquipment;

    // constructor:
    public CharacterClass()
    {

    }

    // getters:
    public int getNumHitDice() {
        return numHitDice;
    }

    public String getHitDice() {
        return hitDice;
    }

    public int getHitPoints(int constitution) {
        int hitDie = Integer.parseInt(getHitDice().substring(1, 2));
        return hitDie + constitution;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public String[] getSavingThrows() {
        return savingThrows;
    }

    public String[] getSkills() {
        return skills;
    }

    public String[] getFeatures() {
        return features;
    }

    public String[] getProficiencies() {
        return proficiencies;
    }

    public String[] getFirstEquipmentChoice() {
        return firstEquipmentChoice;
    }

    public String[] getSecondEquipmentChoice() {
        return secondEquipmentChoice;
    }

    public String[] getGuaranteedEquipment() {
        return guaranteedEquipment;
    }
}
