package com.dean.service.demography.impl;

import com.dean.domain.demography.Gender;
import com.dean.factory.demography.GenderFactory;
import com.dean.repository.demography.impl.GenderRepositoryImpl;
import com.dean.service.demography.GenderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderServiceImplTest {
    private GenderRepositoryImpl repository;
    private Gender gender;
    private GenderService service;


    @Before
    public void setUp() throws Exception {
        this.service = GenderServiceImpl.getGenderService();
    }

    @Test
    public void a_create() {
        Gender employee = GenderFactory.buildGender("Male");

        service.create(employee);
        Gender inRepo = service.read(employee.getId());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        Gender employee = GenderFactory.buildGender("Male");

        service.create(employee);
        Gender inRepo = service.read(employee.getId());
        employee.setDescription("dean");
        service.update(employee);
        Assert.assertEquals(employee.getId(), inRepo.getId());
    }

    @Test
    public void e_delete() {
        Gender employee = GenderFactory.buildGender("Male");

        service.create(employee);
        Gender inRepo = service.read(employee.getId());
        Assert.assertNotNull(inRepo);
        service.delete(employee.getId());
        Gender deleted = service.read(employee.getId());
        Assert.assertNull(deleted);
    }

    @Test
    public void b_read() {
        Gender employee = GenderFactory.buildGender("Male");

        service.create(employee);
        Gender inRepo = service.read(employee.getId());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<Gender> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }
}