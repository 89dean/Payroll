package com.dean.repository.user;

import com.dean.domain.user.Employee;
import com.dean.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}

