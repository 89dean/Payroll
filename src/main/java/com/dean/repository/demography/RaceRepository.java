package com.dean.repository.demography;

import com.dean.domain.demography.Race;
import com.dean.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String> {
    Set<Race> getAll();
}
