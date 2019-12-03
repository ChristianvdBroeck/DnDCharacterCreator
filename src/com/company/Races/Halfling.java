package com.company.Races;

import com.company.BaseClasses.CharacterRace;
import java.util.Map;

/*
 * Created by Christian van den Broeck on 03/12/2019
 * ===
 * THE HALFLING RACE
 *
 */

public class Halfling extends CharacterRace {

    // fields
    private Map<String, Integer> abilityScoreIncrease = Map.of("Dexterity", 2);
    private int speed = 25;
    private String size = "3feet";
    private String[] racialAbilities = { "Lucky", "Brave", "Halfling Nimbleness" };
    private String[] languages = { "Common", "Halfling" };
    // tool proficiencies

    // constructor:
    public Halfling() {
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
