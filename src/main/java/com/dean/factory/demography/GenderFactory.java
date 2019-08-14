package com.dean.factory.demography;

import com.dean.domain.demography.Gender;
import com.dean.util.Misc;

public class GenderFactory {

    public static Gender buildGender(String gender){
        return new Gender.Builder()
                .id(Misc.generateId())
                .description(gender)
                .build();
    }
}
