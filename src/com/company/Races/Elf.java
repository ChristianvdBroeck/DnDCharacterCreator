package com.company.Races;

import com.company.BaseClasses.CharacterRace;
import java.util.Map;

/*
 * Created by Christian van den Broeck on 03/12/2019
 * ===
 * THE ELF RACE
 *
 */

public class Elf extends CharacterRace {

    // fields
    private Map<String, Integer> abilityScoreIncrease = Map.of("Dexterity", 2);
    private int speed = 30;
    private String size = "Between 5 and 6 feet";
    private String[] racialAbilities = { "Darkvision", "Fey Ancestry", "Trance" };
    private String[] languages = { "Common", "Elvish", "One of Your Choice" };
    // tool proficiencies

    // constructor:
    public Elf() {
        super();

        this.setAbilityScoreIncrease(this.abilityScoreIncrease);
        this.setSpeed(this.speed);
        this.setSize(this.size);
        this.setLanguages(this.languages);
        this.setRacialAbilities(this.racialAbilities);
    }

    public Map<String, Integer> getAbilityScoreIncrease() {
        return abilityScoreIncrease;
    }

    public int getSpeed() {
        return speed;
    }

    public String getSize() {
        return size;
    }

    public String[] getRacialAbilities() {
        return racialAbilities;
    }

    public String[] getLanguages() {
        return languages;
    }
}
