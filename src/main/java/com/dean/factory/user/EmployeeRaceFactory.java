package com.dean.factory.user;

import com.dean.domain.user.EmployeeRace;
import com.dean.util.Misc;

public class EmployeeRaceFactory {
    public static EmployeeRace buildEmployeeRace(String employeeNumber, String raceId){
        return new EmployeeRace.Builder()
                .employeeNumber(Misc.generateId())
                .raceId()
                .build();
    }

}
