package com.company.Classes;

import com.company.BaseClasses.AbilityScores;
import com.company.BaseClasses.CharacterClass;
import com.company.Enums.Proficiencies;

public class Fighter extends CharacterClass {
    public Fighter() {
        super("Fighter", "Player's Handbook", false, List<Proficiencies>(Proficiencies.proficiency.ATHLETICS, Proficiencies.proficiency.ACROBATICS));


    }
}
