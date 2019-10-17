package com.company.BaseClasses;

import com.company.Enums.Proficiencies;

import java.util.Map;

public abstract class CharacterRace {

    private String name;
    private Map<Proficiencies.proficiency, Integer> proficiencies;
    private Map<String, String> racialFeatures;
//    private String subrace; // mss een enum? Deze moet ook toegevoegd worden aan de individuele races.

    public CharacterRace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Proficiencies.proficiency, Integer> getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(Map<Proficiencies.proficiency, Integer> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public Map<String, String> getRacialFeatures() {
        return racialFeatures;
    }

    public void setRacialFeatures(Map<String, String> racialFeatures) {
        this.racialFeatures = racialFeatures;
    }
}
