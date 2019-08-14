package com.dean.service.user;

import com.dean.domain.user.EmployeeRace;
import com.dean.service.IService;

import java.util.Set;

public interface EmployeeRaceService extends IService<EmployeeRace, String>{
    Set<EmployeeRace> getAll();
}
