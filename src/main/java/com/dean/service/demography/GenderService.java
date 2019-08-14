package com.dean.service.demography;

import com.dean.domain.demography.Gender;
import com.dean.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {

    Set<Gender> getAll();
}
