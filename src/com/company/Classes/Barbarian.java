package com.company.Classes;

import com.company.BaseClasses.AbilityScores;
import com.company.BaseClasses.CharacterClass;
import com.company.Enums.Proficiencies;

import java.util.List;

public class Barbarian extends CharacterClass {

    public Barbarian(String name, String originBook, boolean isSpellcaster, List<Proficiencies> classProficiencies, AbilityScores abilityScores) {
        super(name, originBook, isSpellcaster, classProficiencies, abilityScores);
    }
}
