package com.dean.controller.user;

import com.dean.domain.demography.Gender;
import com.dean.domain.demography.Race;
import com.dean.domain.user.Employee;
import com.dean.domain.user.EmployeeGender;
import com.dean.domain.user.EmployeeRace;
import com.dean.factory.demography.GenderFactory;
import com.dean.factory.demography.RaceFactory;
import com.dean.factory.user.EmployeeFactory;
import com.dean.factory.user.EmployeeGenderFactory;
import com.dean.factory.user.EmployeeRaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeControllerTest {

    private EmployeeController employeeController;

    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }


    @Test
    public void create() {
        Gender gender = GenderFactory.buildGender("Male");
        Race race = RaceFactory.buildRace("Coloured");
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("000", "999");
        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("888", "333");
        Employee employee = EmployeeFactory.buildEmployee("dean", "February");


        employeeController.create("dean", "February", "123", "456");
        Assert.assertNotNull(employeeController);

    }
}