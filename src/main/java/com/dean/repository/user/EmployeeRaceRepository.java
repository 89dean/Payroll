package com.dean.repository.user;

import com.dean.domain.user.EmployeeRace;
import com.dean.repository.IRepository;

import java.util.Set;

public interface EmployeeRaceRepository extends IRepository<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
