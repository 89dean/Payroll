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
import com.dean.service.demography.GenderService;
import com.dean.service.demography.RaceService;
import com.dean.service.demography.impl.GenderServiceImpl;
import com.dean.service.demography.impl.RaceServiceImpl;
import com.dean.service.user.EmployeeGenderService;
import com.dean.service.user.EmployeeRaceService;
import com.dean.service.user.EmployeeService;
import com.dean.service.user.impl.EmployeeGenderServiceImpl;
import com.dean.service.user.impl.EmployeeRaceServiceImpl;
import com.dean.service.user.impl.EmployeeServiceImpl;


public class EmployeeController {

    private EmployeeService employeeService = EmployeeServiceImpl.getEmployeeService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getEmployeeGenderService();
    private EmployeeRaceService employeeRaceService = EmployeeRaceServiceImpl.getEmployeeRaceService();
    private RaceService raceService = RaceServiceImpl.getRaceService();
    private GenderService genderService = GenderServiceImpl.getGenderService();

    public void create(String firstName, String lastName, String genderId, String raceId){

        Employee employee = EmployeeFactory.buildEmployee(firstName, lastName);
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("123", "456");
        employeeGenderService.create(employeeGender);

        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("567", "987");
        employeeRaceService.create(employeeRace);

        Race race = RaceFactory.buildRace("Indian");
        raceService.create(race);

        Gender gender = GenderFactory.buildGender("Male");
        genderService.create(gender);


    }


}
