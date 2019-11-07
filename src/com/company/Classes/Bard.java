package com.company.Classes;


import com.company.BaseClasses.CharacterClass;

/*
 * Created by Christian van den Broeck on 06/11/2019
 * ===
 * THE BARD CLASS
 *
 */

public class Bard extends CharacterClass {

    // fields:
    private String hitDice = "d8";
    private String[] savingThrows = {"Dexterity", "Charisma"};
    private String[] skillsChoice = {}; // choose three of entire list
    private String[] features = {"Spellcasting", "Bardic Inspiration"};
    private String[] proficiencies = {"Simple Weapons", "Hand Crossbows", "Longswords", "Rapiers", "Short Swords"};
    private String[] firstEquipmentChoice = {"Rapier", "Longsword", "Any Simple Weapon"};
    private String[] secondEquipmentChoice = {"Lute", "Any Other Musical Instrument"};
    private String [] guaranteedEquipment = {"Diplomat's Pack", "Entertainer's Pack"};

    private int proficiencyBonus = 2;
    private int numHitDice = 1;             // both rely on level

    // constructor:

    public Bard() {
        super();

        super.setProficiencyBonus(this.proficiencyBonus);
        super.setNumHitDice(this.numHitDice);
        super.setHitDice(this.hitDice);
        super.setSavingThrows(this.savingThrows);
        super.setSkillsChoice(this.skillsChoice);
        super.setFeatures(this.features);
        super.setWeaponProficiencies(this.proficiencies);
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
    public String[] getWeaponProficiencies() {
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
