package com.dean.repository.user.impl;

import com.dean.domain.user.EmployeeGender;
import com.dean.repository.user.EmployeeGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {

    private static EmployeeGenderRepository repository = null;

    private Set<EmployeeGender> employeeGenders;

    private EmployeeGenderRepositoryImpl(){
        this.employeeGenders = new HashSet<>();
    }

    public static EmployeeGenderRepository getRepository(){
        if (repository == null) repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        this.employeeGenders.add(employeeGender);
        return employeeGender;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        EmployeeGender updatedEmployee = null;

        EmployeeGender e = read(employeeGender.getEmployeeNumber());
        if (e != null){
            delete(employeeGender.getEmployeeNumber());
            this.employeeGenders.add(employeeGender);
            updatedEmployee = employeeGender;
        }
        return updatedEmployee;
    }

    @Override
    public EmployeeGender delete(String s) {
        EmployeeGender e = read(s);
        if (e != null) {
            this.employeeGenders.remove(e);
        }
        return e;
    }

    @Override
    public EmployeeGender read(final String s) {
        return this.employeeGenders.stream().filter(e -> e.getEmployeeNumber().equals(s)).findAny().orElse(null);
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return this.employeeGenders;
    }
}
