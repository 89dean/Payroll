package com.dean.factory.demography;

import com.dean.domain.demography.Race;
import com.dean.util.Misc;

public class RaceFactory {

    public static Race buildRace(String race){
        return new Race.Builder()
                .id(Misc.generateId())
                .description(race)
                .build();
    }

}
