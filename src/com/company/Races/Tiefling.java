package com.company.Races;

import com.company.BaseClasses.CharacterRace;
import java.util.Map;

/*
 * Created by Christian van den Broeck on 03/12/2019
 * ===
 * THE TIEFLING RACE
 *
 */

public class Tiefling extends CharacterRace {

    // fields
    private Map<String, Integer> abilityScoreIncrease = Map.of("Charisma", 2, "Intelligence", 1);
    private int speed = 30;
    private String size = "Between 4 and 5 feet";
    private String[] racialAbilities = { "Darkvision", "Hellish Resistance", "Infernal Legacy" };
    private String[] languages = { "Common", "Infernal" };
    // tool proficiencies

    // constructor:
    public Tiefling() {
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
