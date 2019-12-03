package com.company.Races;

import com.company.BaseClasses.CharacterRace;
import java.util.Map;

/*
 * Created by Christian van den Broeck on 03/12/2019
 * ===
 * THE HALF-ORC RACE
 *
 */

public class HalfOrc extends CharacterRace {

    // fields
    private Map<String, Integer> abilityScoreIncrease = Map.of("Strength", 2, "Constitution", 1);
    private int speed = 30;
    private String size = "Between 5 and 6 feet";
    private String[] racialAbilities = { "Darkvision", "Menacing", "Savage Attacks", "Relentless Endurance" };
    private String[] languages = { "Common", "Orc" };
    // tool proficiencies

    // constructor:
    public HalfOrc() {
        super();

        this.setAbilityScoreIncrease(this.abilityScoreIncrease);
        this.setSpeed(this.speed);
        this.setSize(this.size);
        this.setLanguages(this.languages);
        this.setRacialAbilities(this.racialAbilities);
    }

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
    public String[] getRacialAbilities() {
        return racialAbilities;
    }

    @Override
    public String[] getLanguages() {
        return languages;
    }
}
