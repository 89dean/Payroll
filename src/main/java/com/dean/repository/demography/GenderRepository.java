package com.dean.repository.demography;

import com.dean.domain.demography.Gender;
import com.dean.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
