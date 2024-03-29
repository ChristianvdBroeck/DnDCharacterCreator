package com.company.Races;

import com.company.BaseClasses.CharacterRace;
import java.util.Map;

/*
 * Created by Christian van den Broeck on 03/12/2019
 * ===
 * THE DWARF RACE
 *
 */

public class Dwarf extends CharacterRace {

    // fields
    private Map<String, Integer> abilityScoreIncrease = Map.of("Constitution", 2);
    private int speed = 25;
    private String size = "Between 4 and 5 feet";
    private String[] racialAbilities = { "Darkvision", "Dwarven Religion", "Dwarven Combat Training", "Stonecunning" };
    private String[] languages = { "Common", "Dwarvish" };
    // tool proficiencies

    // constructor:
    public Dwarf() {
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
