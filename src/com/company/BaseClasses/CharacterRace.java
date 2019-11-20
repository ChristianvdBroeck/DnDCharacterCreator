package com.company.BaseClasses;

import com.company.Enums.Proficiencies;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by Christian van den Broeck on 02/10/2019
 * ===
 * This base class describes a character's class. All specific classes will inherit from this base class.
 *
 */

public abstract class CharacterRace {

    /*
     * set-up a little different than the example:
     * the example uses variables in the constructor.
     * Namely a name and all the ability scores (and bonusses).
     * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     */


    // fields:
    private Map<String, Integer> abilityScoreIncrease;
    private int speed;
    private String size;
    private String[] languages;
    private String[] racialAbilities;
//    private String subrace; // mss een enum? Deze moet ook toegevoegd worden aan de individuele races.


    // constructor:
    public CharacterRace() {

    }

    // getters:
    public int getSpeed() {
        return speed;
    }

    public String getSize() {
        return size;
    }

    public String[] getLanguages() {
        return languages;
    }

    public String[] getRacialAbilities() {
        return racialAbilities;
    }

    public Map<String, Integer> getAbilityScoreIncrease() {
        return abilityScoreIncrease;
    }

    // setters;
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public void setRacialAbilities(String[] racialAbilities) {
        this.racialAbilities = racialAbilities;
    }

    public void setAbilityScoreIncrease(Map<String, Integer> abilityScoreIncrease) {
        this.abilityScoreIncrease = abilityScoreIncrease;
    }
}
