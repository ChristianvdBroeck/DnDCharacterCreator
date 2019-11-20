package com.company;

import com.company.Races.Dragonborn;

public class Main {

    public static void main(String[] args) {
        Dragonborn kees = new Dragonborn();
        kees.getAbilityScoreIncrease().forEach((key, value) -> System.out.println(key + " increases by " + value));
    }




}
