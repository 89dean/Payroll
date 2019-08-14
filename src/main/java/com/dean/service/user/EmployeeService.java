package com.dean.service.user;

import com.dean.domain.user.Employee;
import com.dean.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {

    Set<Employee> getAll();
}
