package com.dean.service.demography;

import com.dean.domain.demography.Gender;
import com.dean.domain.demography.Race;
import com.dean.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, String> {
    Set<Race> getAll();
}