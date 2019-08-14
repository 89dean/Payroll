package com.dean.factory.user;

import com.dean.domain.user.Employee;
import com.dean.util.Misc;

public class EmployeeFactory {

    public static Employee buildEmployee(String firstName, String lastName){
        return new Employee.Builder()
                .employeeNumber(Misc.generateId())
                .employeeFirstName(firstName)
                .employeeLastName(lastName)
                .build();
    }

}
