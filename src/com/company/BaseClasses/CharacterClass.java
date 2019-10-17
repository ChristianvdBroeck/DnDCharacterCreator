package com.company.BaseClasses;

import com.company.Enums.Proficiencies;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Created by Christian van den Broeck on 02/10/2019
 * ===
 * This base class describes a character's class. All specific classes will inherit from this base class.
 *
 */

public abstract class CharacterClass {

    private String name;
    private String originBook;
    private boolean spellcaster;
    private AbilityScores abilityScores;

    // Add when appropriate objects are created
    private List<Proficiencies> classProficiencies;

    public CharacterClass(String name, String originBook, boolean isSpellcaster, List<Proficiencies> classProficiencies, AbilityScores abilityScores/*, Map.Entry<AvilityScore, int> bonus,*/) {
        this.name = name;
        this.originBook = originBook;
        this.classProficiencies = classProficiencies;
//        this.bonus = bonus;
        this.spellcaster = isSpellcaster;
        this.abilityScores = abilityScores;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginBook() {
        return originBook;
    }

    public void setOriginBook(String originBook) {
        this.originBook = originBook;
    }

    public boolean isSpellcaster() {
        return spellcaster;
    }

    public void setSpellcaster(boolean spellcaster) {
        spellcaster = spellcaster;
    }

    public List<Proficiencies> getClassProficiencies() {
        return classProficiencies;
    }
//
//    public void setClassProficiencies(List<Proficiency> classProficiencies) {
//        this.classProficiencies = classProficiencies;
//    }
//
//    public void setBonus(Map.Entry<AvilityScore, int> bonus) {
//        this.bonus = bonus;
//    }
}
