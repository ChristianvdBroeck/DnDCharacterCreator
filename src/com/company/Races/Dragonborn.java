package com.company.Races;

import com.company.BaseClasses.CharacterRace;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by Christian van den Broeck on 03/12/2019
 * ===
 * THE DRAGONBORN RACE
 *
 */

public class Dragonborn extends CharacterRace {

    // fields
    private Map<String, Integer> abilityScoreIncrease = Map.of("Strength", 2, "Charisma", 1);
    private int speed = 30;
    private String size = "Over 6 feet";
    private String[] languages = { "Common", "Draconinc" };
    private String[] racialAbilities = { "Draconic Ancestory", "Dragon Breath", "Damage Resistance" };

    // constructor:
    public Dragonborn() {
        super();

        this.setAbilityScoreIncrease(this.abilityScoreIncrease);
        this.setSpeed(this.speed);
        this.setSize(this.size);
        this.setLanguages(this.languages);
        this.setRacialAbilities(this.racialAbilities);
    }

    // getters:
    @Override
    public Map<String, Integer> getAbilityScoreIncrease() {
        return abilityScoreIncrease;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String[] getLanguages() {
        return languages;
    }

    @Override
    public String[] getRacialAbilities() {
        return racialAbilities;
    }
}
