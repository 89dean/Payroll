package com.dean.service.user;

import com.dean.domain.user.EmployeeGender;
import com.dean.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
