package com.company.Races;

import com.company.BaseClasses.CharacterRace;
import java.util.Map;

/*
 * Created by Christian van den Broeck on 03/12/2019
 * ===
 * THE HUMAN RACE
 *
 */

public class Human extends CharacterRace {

    // fields
    private Map<String, Integer> abilityScoreIncrease = Map.of("All", 2 );
    private int speed = 25;
    private String size = "Between 5 and 6 feet";
    private String[] racialAbilities = {  };
    private String[] languages = { "Common", "One of Your Choice" };
    // tool proficiencies

    // constructor:
    public Human() {
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
