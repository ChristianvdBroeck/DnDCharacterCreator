package com.company.Classes;

import com.company.BaseClasses.AbilityScores;
import com.company.BaseClasses.CharacterClass;
import com.company.Enums.Proficiencies;

import java.util.List;

public class Rogue extends CharacterClass {

    public Rogue(String name, String originBook, boolean isSpellcaster, List<Proficiencies> classProficiencies, AbilityScores abilityScores) {
        super(name, originBook, isSpellcaster, classProficiencies, abilityScores);
    }
}
