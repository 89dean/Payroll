package com.dean.factory.user;

import com.dean.domain.user.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String empId,String genderId){
        return new EmployeeGender(empId, genderId);
    }
}
